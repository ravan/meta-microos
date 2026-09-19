SUMMARY = "Development Files for workrave"
DESCRIPTION = "This package contains header files needed for developing plugins for \
Workrave."
LICENSE = "GPL-3.0-only"

PV = "1.10.54"

RPM_NAME = "workrave-devel-1.10.54-1.10.aarch64.rpm"
RPM_HASH = "c524272a32f5e45b4584a673868dc6e3f3acce85a19f6380c3018a227c2b2058af76d311ae156741233fea05cdb484cd68f6da6c52b3f4e3d398656cc4ecb341"

RPROVIDES:${PN} += "workrave-devel"

RDEPENDS:${PN} += ""

inherit rpm
