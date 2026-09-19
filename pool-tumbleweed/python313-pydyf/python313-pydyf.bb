SUMMARY = "A low-level PDF generator"
DESCRIPTION = "A low-level PDF generator written in Python and based on PDF specification 1.7."
LICENSE = "BSD-3-Clause"

PV = "0.12.1"

RPM_NAME = "python313-pydyf-0.12.1-1.4.noarch.rpm"
RPM_HASH = "0fe9fb330106cc2bd29afab27df4997030cc4c80fc8bef71df8ea205484c21325086662478f39589f64e65784ab3103811f9ecf641a51761ba85540c23087024"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pydyf \
python3.13dist-pydyf \
python313-pydyf \
python3dist-pydyf"

RDEPENDS:${PN} += "python-abi"

inherit rpm
