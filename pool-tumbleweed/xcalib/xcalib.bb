SUMMARY = "Load ICC profile calibration part to graphics card"
DESCRIPTION = "The command line tool applies the 'vcgt'-tag of ICC profiles to your X-server \
like MS-Windows or MacOS can to set your display to a calibrated state. \
 \
Versions 0.5 and higher are also usable with Microsoft Windows. \
They can be used as a free alternative to other calibration loaders."
LICENSE = "GPL-2.0-or-later"

PV = "0.10"

RPM_NAME = "xcalib-0.10-2.6.aarch64.rpm"
RPM_HASH = "c02767fa7a9eb355a5c15fee089c3a39b464463a8913ec8549a26d4547d63c3b52f0cba69b2a0219898efeec2d7104284cd83c4254c44e66102edf975e3f67c9"

RPROVIDES:${PN} += "xcalib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXrandr.so.2 \
libXxf86vm.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
