SUMMARY = "Development files for AngelScript"
DESCRIPTION = "The AngelCode Scripting Library, or AngelScript as it is also known, \
is a scripting library designed to allow applications to extend their \
functionality through external scripts. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of the AngelScript library."
LICENSE = "Zlib"

PV = "2.38.0"

RPM_NAME = "angelscript-devel-2.38.0-2.5.aarch64.rpm"
RPM_HASH = "1d5c08626b094ff4a40ea22a5e04c98319c5f5960392c3efbd3b5ed1998e4285c9182f12f022644c5ff2f8dca18857c9af41b3ff5c47040bd1807f5830c45317"

RPROVIDES:${PN} += "angelscript-devel \
pkgconfig-angelscript \
pkgconfig-angelscript-addons"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libangelscript-addons2-38-0 \
libangelscript2-38-0 \
pkgconfig-angelscript"

inherit rpm
