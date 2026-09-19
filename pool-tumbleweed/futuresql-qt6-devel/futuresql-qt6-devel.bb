SUMMARY = "Development files for futuresql"
DESCRIPTION = "This package contains development files needed to use futuresql."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.1"

RPM_NAME = "futuresql-qt6-devel-0.1.1-1.11.aarch64.rpm"
RPM_HASH = "0a2e34d5f2d75e1d7a8af80ea7fa7b93d6520c2b1080a1a9c74809b58a3170eeaf95ca6944d771572391a237c4426095676dfc08444ea27dc44f8bdc8d08ff74"

RPROVIDES:${PN} += "cmake-FutureSQL6 \
futuresql-qt6-devel"

RDEPENDS:${PN} += "libfuturesql6-0"

inherit rpm
