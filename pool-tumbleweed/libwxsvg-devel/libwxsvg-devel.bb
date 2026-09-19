SUMMARY = "Header files for wxsvg"
DESCRIPTION = "Include files for developing programs based on wxsvg."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "1.5.25"

RPM_NAME = "libwxsvg-devel-1.5.25-2.6.aarch64.rpm"
RPM_HASH = "33b8e66de8dcda6cdcdb0683d6b68719b82085924a4e64f2b76875e75d5ba9e49ff50dbe50d56235d3d10141d7aa877962f7b15405552710fc8de220f589beea"

RPROVIDES:${PN} += "libwxsvg-devel \
pkgconfig-libwxsvg"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwxsvg3 \
pkgconfig-expat \
pkgconfig-libexif \
pkgconfig-pango \
wxGTK3-3-2-devel \
wxsvg"

inherit rpm
