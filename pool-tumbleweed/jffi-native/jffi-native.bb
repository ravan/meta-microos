SUMMARY = "The jffi JAR with native bits"
DESCRIPTION = "This package contains jffi JAR with native bits."
LICENSE = "Apache-2.0 | LGPL-3.0-or-later"

PV = "1.3.13"

RPM_NAME = "jffi-native-1.3.13-3.4.aarch64.rpm"
RPM_HASH = "cc4e23e07beb1661d0b4272e61f4344ebcf6dbe936d5ec975de02b276ae79c7dabe6677cd87fc2b5e64ea72b30a91a52c605b507791d2bbefad62a95228d63df"

RPROVIDES:${PN} += "jffi-native \
libjffi-1.2.so \
mvn-com.github.jnr-jffi--native- \
osgi-com.github.jnr.jffi.native"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
libc.so.6 \
libffi.so.8 \
osgi-com.github.jnr.jffi"

inherit rpm
