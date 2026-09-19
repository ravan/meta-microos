SUMMARY = "Python library for displaying data as tabular ASCII"
DESCRIPTION = "Python library for displaying tabular data in an ASCII table format."
LICENSE = "BSD-3-Clause"

PV = "0.9.2"

RPM_NAME = "python314-PTable-0.9.2-4.2.noarch.rpm"
RPM_HASH = "47b30cc818333447143db6f1655756bca1f012445e72570381f7a2dc8855b3e3d9ce2c21ce06a198d6c44ff73726e4acab3a6bf219deae8adc98b6fbe07d566b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ptable \
python314-PTable \
python3dist-ptable"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
