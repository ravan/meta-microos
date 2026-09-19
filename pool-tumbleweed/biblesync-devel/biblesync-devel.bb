SUMMARY = "Development files for biblesync"
DESCRIPTION = "This package contains libraries and header files for developing applications \
that use biblesync."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "biblesync-devel-2.1.0-2.5.aarch64.rpm"
RPM_HASH = "5ac46988909e453e430bc79bbb9dbde749f08233bae2d2a5fc3b8abd61cadf27ad907f137859868a6695d4f678e7f7eb8ea3b38cfbbff0120b8e091c006fb565"

RPROVIDES:${PN} += "biblesync-devel \
pkgconfig-biblesync"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbiblesync2-0 \
libuuid-devel"

inherit rpm
