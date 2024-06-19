name := "SomeValue4s"

version := "0.1.0"

scalaVersion := "2.13.12" // 使用するScalaのバージョン

// PGP署名の設定
pgpPublicRing := file("/path/to/your/.gnupg/secring.gpg")
pgpSecretRing := file("/path/to/your/.gnupg/pubring.gpg")
pgpPassphrase := Some("your-passphrase".toCharArray)

// Sonatypeへの公開設定
sonatypeProfileName := "your.sonatype.profile"
publishMavenStyle := true

// ライブラリとしての設定
publishTo := {
  val nexus = "https://your-nexus-repository"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "/content/repositories/snapshots")
  else
    Some("releases"  at nexus + "/content/repositories/releases")
}

// ライブラリの依存関係
libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.2.16" % Test,
  munit % Test
)

// スキャラフォーマットの設定
scalacOptions ++= Seq(
  "-deprecation",
  "-feature",
  "-unchecked",
  "-encoding", "utf8"
)

// SBTプラグインを利用してのパブリッシュ設定 (optional)
// publishMavenStyle := true

// クロスバージョン対応 (optional)
crossScalaVersions := Seq("2.13.12", "3.2.2")

