SUMMARY = "Python packages license list"
DESCRIPTION = "Dump the software license list of Python packages installed with pip."
LICENSE = "MIT"

PV = "5.5.5"

RPM_NAME = "python314-pip-licenses-5.5.5-1.3.noarch.rpm"
RPM_HASH = "ed33164e8e625b494994464be66a0656d1444951499f9de4f193c32a7f28662c0c4d04420fb9e9917aeb649262130affa0074104459375421dbddc676b006fb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pip-licenses \
python314-pip-licenses \
python3dist-pip-licenses"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-prettytable \
update-alternatives"

inherit rpm
