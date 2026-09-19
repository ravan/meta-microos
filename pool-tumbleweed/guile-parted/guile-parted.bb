SUMMARY = "Guile bindings to Parted"
DESCRIPTION = "This package provides Guile bindings to GNU Parted."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.7"

RPM_NAME = "guile-parted-0.0.7-2.9.aarch64.rpm"
RPM_HASH = "3329bcbc6314866fea49ad22160adb3c240d9a172965e97015097c396f9868b9a4ec322af1df1d5cccbddd9a62332af4f23d9a463986f13b753117f89e6fd955"

RPROVIDES:${PN} += "guile-parted"

RDEPENDS:${PN} += "guile \
guile-bytestructures \
parted-devel"

inherit rpm
