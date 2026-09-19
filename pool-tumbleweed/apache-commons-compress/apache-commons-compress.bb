SUMMARY = "Java API for working with compressed files and archivers"
DESCRIPTION = "The Apache Commons Compress library defines an API for working with \
ar, cpio, Unix dump, tar, zip, gzip, XZ, Pack200 and bzip2 files. \
In version 1.14 read-only support for Brotli decompression has been added, \
but it has been removed from this package."
LICENSE = "Apache-2.0"

PV = "1.28.0"

RPM_NAME = "apache-commons-compress-1.28.0-2.3.noarch.rpm"
RPM_HASH = "e75ea7c0ea18f32654331368df9336f108b2b2ced1271a05a91166c13400ad3150433ed0450a7d5a5b854ebbcb17f8d9c3c0b013737db02f841f4b28c0c3833d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-compress \
commons-compress \
jakarta-commons-compress \
mvn-org.apache.commons-commons-compress \
mvn-org.apache.commons-commons-compress-pom- \
osgi-org.apache.commons.commons-compress"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-codec-commons-codec \
mvn-commons-io-commons-io \
mvn-org.apache.commons-commons-lang3"

inherit rpm
