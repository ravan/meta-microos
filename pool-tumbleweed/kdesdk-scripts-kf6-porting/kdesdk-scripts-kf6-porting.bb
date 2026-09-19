SUMMARY = "Scripts for porting applications to KF6"
DESCRIPTION = "This package contains helper scripts to port code to Qt6 and KDE Frameworks 6."
LICENSE = "GFDL-1.2-only & GPL-2.0-only"

PV = "26.08.1"

RPM_NAME = "kdesdk-scripts-kf6-porting-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "a1d01b63599ba7f679436c05713889733a93efc1832bf451afbd2c98864ec7c9114c7702506338eb30f171b54ffe1f79d4a3736ae632009089a8788008f29f44"

RPROVIDES:${PN} += "kdesdk-scripts-kf6-porting"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh"

inherit rpm
