SUMMARY = "Development files for the X11 Screen Saver extension library"
DESCRIPTION = "The X Window System provides support for changing the image on a \
display screen after a user-settable period of inactivity to avoid \
burning the cathode ray tube phosphors. This extension allows an \
external 'screen saver' client to detect when the alternate image is \
to be displayed and to provide the graphics. \
 \
This package contains the development headers for the library found \
in libXss1."
LICENSE = "MIT"

PV = "1.2.5"

RPM_NAME = "libXss-devel-1.2.5-1.5.aarch64.rpm"
RPM_HASH = "ec34acbc9296afaeb05717500bab4287ae935b93e0e32a0c460349c516ee80b5c9d0a785cdc1c3ecd38d4a12a0fc6b4f9b4a0dabc2ffe2536a9917070d0066f2"

RPROVIDES:${PN} += "libXScrnSaver-devel \
libXss-devel \
pkgconfig-xscrnsaver"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXss1 \
pkgconfig-scrnsaverproto \
pkgconfig-x11 \
pkgconfig-xext"

inherit rpm
