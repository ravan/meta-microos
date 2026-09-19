SUMMARY = "Python libraries for Pacemaker"
DESCRIPTION = "Pacemaker is an advanced, scalable High-Availability cluster resource \
manager. \
 \
The python3-pacemaker package contains a Python library that can be used \
to interface with Pacemaker."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.3+20260728.7052efa194"

RPM_NAME = "python3-pacemaker-3.0.3+20260728.7052efa194-1.1.noarch.rpm"
RPM_HASH = "68c48d23775a21ebfd7bcf8d19cfbc92765bbb4968f20aee79dfbcbaebf9cf1f6868efb7d08861d4d8930569f7521f95fc69681b65176c82fc5d2f63d4f84264"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pacemaker \
python3.13dist-pacemaker \
python3dist-pacemaker"

RDEPENDS:${PN} += "pacemaker-libs \
python-abi \
python3"

inherit rpm
