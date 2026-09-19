SUMMARY = "System group timekpr for timekpr-next"
DESCRIPTION = "System group timekpr for package timekpr-next"
LICENSE = "GPL-3.0-only"

PV = "0.5.8"

RPM_NAME = "system-group-timekpr-0.5.8-1.4.noarch.rpm"
RPM_HASH = "138dbd0714003e47c4a9ac4386e4b8d5941b1ee191d1f534d8fef5d4cc98326e84c8b1062b5163f78d7017a7ec066803f2d890332d366f63c4278013d1d91ec7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-timekpr \
system-group-timekpr"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
