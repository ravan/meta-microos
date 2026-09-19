SUMMARY = "Development files for python314-Kivy"
DESCRIPTION = "Kivy is a library for development of applications that make use of \
user interfaces, such as multi-touch apps. \
 \
This package contains the headers and source files for extending kivy"
LICENSE = "Apache-2.0 & MIT & LGPL-2.1-or-later & GPL-2.0-or-later & GPL-3.0-only & BSD-3-Clause"

PV = "2.3.1"

RPM_NAME = "python314-Kivy-devel-2.3.1-5.5.aarch64.rpm"
RPM_HASH = "498e25a94d65045df24004b67b0c06085d860f6e71aeefe7cdea4e90256777407ffdd26d742e92ec28e02c350c4d1de3872368b5ff31a13d31bb29e35ddc6adb"

RPROVIDES:${PN} += "python314-Kivy-devel"

RDEPENDS:${PN} += "python-abi \
python314-Kivy"

inherit rpm
