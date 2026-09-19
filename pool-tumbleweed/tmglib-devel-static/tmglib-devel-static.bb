SUMMARY = "Test Matrix Generator Library: static library"
DESCRIPTION = "This package provides the headers and sources needed to develop against the \
tmglib as a static library."
LICENSE = "BSD-3-Clause"

PV = "3.12.1"

RPM_NAME = "tmglib-devel-static-3.12.1-5.1.aarch64.rpm"
RPM_HASH = "fc3ce5daa3859d2d0017639db376b29095c342b045a04dd163c62ac50763bb9e35acc700fd9d5a30ba231a4f053b182174b088f83d271bc0c1b62281a81d6b1d"

RPROVIDES:${PN} += "tmglib-devel-static"

RDEPENDS:${PN} += "tmglib-devel"

inherit rpm
