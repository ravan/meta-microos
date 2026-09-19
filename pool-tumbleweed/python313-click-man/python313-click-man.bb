SUMMARY = "Automate generation of man pages for python click applications"
DESCRIPTION = "Automate generation of man pages for Python Click applications."
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "python313-click-man-0.5.1-1.5.noarch.rpm"
RPM_HASH = "76628e01954be2f1d29b47b316945a21bad59ef06f57bcec49529efeaef022276505d66122d9384583ed4b0d051cf9aa04224b985c0095878548c483e3754208"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-click-man \
python3.13dist-click-man \
python313-click-man \
python3dist-click-man"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-click \
update-alternatives"

inherit rpm
