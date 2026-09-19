SUMMARY = "Command-line tools for Plasma Activity management"
DESCRIPTION = "This package provides command-line tools to manipulate Plasma Activities."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "plasma6-activities-tools-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "674f77e754fed84513adf89d9d5e2fc5afb45173cfc681853bac8fc5e5e45c9fbd0ccb35c39eb7c44e09bd72b4a4377765af0f5635ee392031edfb8877ff9667"

RPROVIDES:${PN} += "plasma6-activities-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libPlasmaActivities.so.7 \
libPlasmaActivities7 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
