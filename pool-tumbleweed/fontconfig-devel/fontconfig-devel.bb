SUMMARY = "Header files for fontconfig"
DESCRIPTION = "This package countains all include files, libraries, configuration \
files needed for compiling applications which use the fontconfig \
library."
LICENSE = "MIT"

PV = "2.18.1"

RPM_NAME = "fontconfig-devel-2.18.1-1.3.aarch64.rpm"
RPM_HASH = "1f2d3766f38e9a23e7805d4b906a17ee8f6d1dc3143b95ac516dc40009de061dfe8943bb261c8a606a728173651881cdc3abbc04b6e0897ec5f1d0adca506135"

RPROVIDES:${PN} += "fontconfig-devel \
pkgconfig-fontconfig"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gettext-devel \
glibc-devel \
libfontconfig1 \
pkgconfig-expat \
pkgconfig-freetype2"

inherit rpm
