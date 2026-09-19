SUMMARY = "Python packages license list"
DESCRIPTION = "Dump the software license list of Python packages installed with pip."
LICENSE = "MIT"

PV = "5.5.5"

RPM_NAME = "python313-pip-licenses-5.5.5-1.3.noarch.rpm"
RPM_HASH = "ee631429350ef7b0feba59e38b6d3156efe7b55ff425a0e493bfc7862451a5d93c9b50197a7b78b266a0403d7651e49e988f05ce684cb473b7fc655d0f26d83c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pip-licenses \
python3.13dist-pip-licenses \
python313-pip-licenses \
python3dist-pip-licenses"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-prettytable \
update-alternatives"

inherit rpm
