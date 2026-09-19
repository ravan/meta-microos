SUMMARY = "Re-implementation of zlib in pure Java"
DESCRIPTION = "The zlib is designed to be a free, general-purpose, legally \
unencumbered -- that is, not covered by any patents -- lossless \
data-compression library for use on virtually any computer hardware and \
operating system. The zlib was written by Jean-loup Gailly \
(compression) and Mark Adler (decompression)."
LICENSE = "BSD-3-Clause"

PV = "1.1.3"

RPM_NAME = "jzlib-1.1.3-6.9.noarch.rpm"
RPM_HASH = "065e78e2b6adf81d78bdc8b37b42c469b7afb5addd7fd99893c869c63f238534c634c9e3af254dfc53e53ab51647a84bf8b4434cfdd8c69f04e7c9659cf0b7d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jzlib \
mvn-com.jcraft-jzlib \
mvn-com.jcraft-jzlib-pom- \
osgi-com.jcraft.jzlib"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
