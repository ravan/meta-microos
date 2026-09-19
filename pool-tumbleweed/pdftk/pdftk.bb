SUMMARY = "A handy tool for manipulating PDF"
DESCRIPTION = "If PDF is electronic paper, then pdftk is an electronic staple-remover, \
hole-punch, binder, secret-decoder-ring, and X-Ray-glasses. \
Pdftk is a simple tool for doing everyday things with PDF documents. \
 \
Use it to: \
  * Merge PDF Documents \
  * Split PDF Pages into a New Document \
  * Rotate PDF Documents or Pages \
  * Decrypt Input as Necessary (Password Required) \
  * Encrypt Output as Desired \
  * Fill PDF Forms with X/FDF Data and/or Flatten Forms \
  * Generate FDF Data Stencil from PDF Forms \
  * Apply a Background Watermark or a Foreground Stamp \
  * Report PDF Metrics such as Metadata and Bookmarks \
  * Update PDF Metadata \
  * Attach Files to PDF Pages or the PDF Document \
  * Unpack PDF Attachments \
  * Burst a PDF Document into Single Pages \
  * Uncompress and Re-Compress Page Streams \
  * Repair Corrupted PDF (Where Possible)"
LICENSE = "GPL-2.0-or-later"

PV = "3.3.3"

RPM_NAME = "pdftk-3.3.3-3.10.noarch.rpm"
RPM_HASH = "4d8ba989f8b87d551e52210ee4d9ac76c2d49a1bbd28c2eb560c09d1db893ea0799cbedc9fee84c85a0b152c6306af8c6a7c0ec9b0985b76341dd0ccd9397313"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.gitlab.pdftk-java-pdftk-java \
mvn-com.gitlab.pdftk-java-pdftk-java-pom- \
osgi-pdftk-java \
pdftk"

RDEPENDS:${PN} += "/usr/bin/bash \
apache-commons-lang3 \
bouncycastle \
java-headless \
javapackages-filesystem \
javapackages-tools \
mvn-org.apache.commons-commons-lang3 \
mvn-org.bouncycastle-bcprov-jdk18on"

inherit rpm
