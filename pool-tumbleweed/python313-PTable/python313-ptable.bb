SUMMARY = "Python library for displaying data as tabular ASCII"
DESCRIPTION = "Python library for displaying tabular data in an ASCII table format."
LICENSE = "BSD-3-Clause"

PV = "0.9.2"

RPM_NAME = "python313-PTable-0.9.2-4.2.noarch.rpm"
RPM_HASH = "358b4416b2c02664ccb6c948f209700c145328fa6129838cc812f9338ffbf989792453feddf5f6b57218a3ada73fe4b8da6120dbe4f96a4ba0b8a38bbcca7fbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PTable \
python3.13dist-ptable \
python313-PTable \
python3dist-ptable"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
