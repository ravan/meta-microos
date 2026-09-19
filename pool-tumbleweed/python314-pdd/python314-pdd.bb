SUMMARY = "Tiny date, time diff calculator with timers"
DESCRIPTION = "pdd (Python3 Date Diff) is a small cmdline utility to calculate date and time difference. It can also be used as a timer"
LICENSE = "GPL-3.0-only"

PV = "1.7"

RPM_NAME = "python314-pdd-1.7-3.5.noarch.rpm"
RPM_HASH = "4eefd22652346d024dc3c4a9597273d0c5732b48057459dea5ace32d0c8cfaeba4d8b4b94fe80c3e0273bda04a7e743f42a6e282542ba10e871c1ca9ec5f4bbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pdd \
python314-pdd \
python3dist-pdd"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-python-dateutil \
python314-setuptools"

inherit rpm
