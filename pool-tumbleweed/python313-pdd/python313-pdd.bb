SUMMARY = "Tiny date, time diff calculator with timers"
DESCRIPTION = "pdd (Python3 Date Diff) is a small cmdline utility to calculate date and time difference. It can also be used as a timer"
LICENSE = "GPL-3.0-only"

PV = "1.7"

RPM_NAME = "python313-pdd-1.7-3.5.noarch.rpm"
RPM_HASH = "aff66cd21967441007f366ce008fc4290da09f64fc15e8ae20959367db8fb5ed607d4fc5e63f76f3baf77bdcd71028d607f1202dc627a96301a4f7e8d2f8a523"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pdd \
python3.13dist-pdd \
python313-pdd \
python3dist-pdd"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-python-dateutil \
python313-setuptools"

inherit rpm
