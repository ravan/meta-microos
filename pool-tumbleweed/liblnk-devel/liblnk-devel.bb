SUMMARY = "Development files for liblnk, a library to access Windows Shortcut Links"
DESCRIPTION = "liblnk is a library to access Windows Shortcut File (LNK) files. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of liblnk."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20260525"

RPM_NAME = "liblnk-devel-20260525-1.10.aarch64.rpm"
RPM_HASH = "39d457c709cf8c9e4cd53fd4e96617e40dd9b956a5094f2e630f68a103e00813cf033f28bebf6eeaaf2bf46ea0448338c1f54bfee2fe5a2ab29259cca2028f16"

RPROVIDES:${PN} += "liblnk-devel \
pkgconfig-liblnk"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
liblnk1"

inherit rpm
