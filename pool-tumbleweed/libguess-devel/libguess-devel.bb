SUMMARY = "Development package for libguess"
DESCRIPTION = "A high-speed character set detection library \
 \
This package contains the files needed to compile programs that use the \
libguess library."
LICENSE = "BSD-3-Clause"

PV = "1.2"

RPM_NAME = "libguess-devel-1.2-1.37.aarch64.rpm"
RPM_HASH = "d910256789ded13e8b20721948a8f51044eb0ebd85ff581c3556986030c97571e63c4e9a03c8fc94756d3a409768d8292eb5df029bca5a8fbc38a3800b95a3e3"

RPROVIDES:${PN} += "libguess-devel \
pkgconfig-libguess"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libguess1 \
libmowgli2-devel \
pkg-config"

inherit rpm
