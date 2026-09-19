SUMMARY = "development files for the Linux Power Capping Framework"
DESCRIPTION = "This project provides the powercap library -- a generic C interface to the \
Linux power capping framework (sysfs interface). It includes an implementation \
for working with Intel Running Average Power Limit (RAPL). \
 \
This package provides the devel files."
LICENSE = "GPL-2.0-only"

PV = "0.6.0"

RPM_NAME = "powercap-devel-0.6.0-1.15.aarch64.rpm"
RPM_HASH = "dbe7bc5d5d0cd2fdab6a98d75f0a5f119a0b78f8565d65a8bf3d8d6013a0f4e94d96fc5b81546a2acb4b0eab5990b2a9dfd5427ea45786b28b36ac4a02062e7b"

RPROVIDES:${PN} += "cmake-Powercap \
pkgconfig-powercap \
powercap-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
powercap"

inherit rpm
