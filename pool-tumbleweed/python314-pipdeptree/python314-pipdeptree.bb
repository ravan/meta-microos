SUMMARY = "Command line utility to show dependency tree of packages"
DESCRIPTION = "Command line utility to show dependency tree of packages."
LICENSE = "MIT"

PV = "3.1.1"

RPM_NAME = "python314-pipdeptree-3.1.1-1.2.noarch.rpm"
RPM_HASH = "279e2c272118537db6290af0924b2c05c2b0bf5810075c8da70b70dd4fb79ff21ebc1b737515410f1793f721d21c67e140792c65b2b320e08223edac8a4d876e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pipdeptree \
python314-pipdeptree \
python3dist-pipdeptree"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-packaging \
python314-rich"

inherit rpm
