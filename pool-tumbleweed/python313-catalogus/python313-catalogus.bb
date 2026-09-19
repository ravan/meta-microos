SUMMARY = "Python classes for name-to-object registry-like support"
DESCRIPTION = "A Python library providing classes for name-to-object registry-like support."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.2"

RPM_NAME = "python313-catalogus-0.1.2-1.1.noarch.rpm"
RPM_HASH = "91dd7ffc868fa1b6019f44890d7604e963f51a753fc62249fb59c3247cb5d9cfdcb20f1d359e4c8a35e23c913d91b215d33ddbd42e37f0f7744160840fe85dd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-catalogus \
python3.13dist-catalogus \
python313-catalogus \
python3dist-catalogus"

RDEPENDS:${PN} += "python-abi"

inherit rpm
