SUMMARY = "Libraries and header files to develop programs with libiniparser support"
DESCRIPTION = "This package contains the static libraries and header files needed to develop \
programs which make use of the libiniparser programming interface. \
 \
The libiniparser offers parsing of ini files from the C level. See a complete \
documentation in HTML format, from the /usr/share/doc/packages/libiniparser-devel directory \
open the file html/index.html with any HTML-capable browser."
LICENSE = "MIT"

PV = "4.2.6"

RPM_NAME = "libiniparser-devel-4.2.6-2.2.aarch64.rpm"
RPM_HASH = "46aa92d4c34500a037bbd3d539c5b1a41418fafb034f5e7a8dedadc8f4edceae2134358c60af9ce83c260e8d75f3350c38fe17ae55547ebd211256fcd1f5275d"

RPROVIDES:${PN} += "cmake-iniparser \
cmake-unity \
libiniparser-devel \
pkgconfig-iniparser"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libiniparser4"

inherit rpm
