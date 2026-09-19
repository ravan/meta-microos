SUMMARY = "Devel files for ftxui"
DESCRIPTION = "Development files for ftxui."
LICENSE = "MIT"

PV = "7.0.3"

RPM_NAME = "ftxui-devel-7.0.3-1.1.aarch64.rpm"
RPM_HASH = "cd3c3130dbe75590182c14ee3d703944d9a5b84de90467842abda4da27505b070c7ecd52a66f02c904ae6ae8aa13c9d319b0f1a2fbd640ffde1a74dcd2f08251"

RPROVIDES:${PN} += "cmake-ftxui \
ftxui \
ftxui-devel \
pkgconfig-ftxui"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libftxui7"

inherit rpm
