SUMMARY = "Command line utility to show dependency tree of packages"
DESCRIPTION = "Command line utility to show dependency tree of packages."
LICENSE = "MIT"

PV = "3.1.1"

RPM_NAME = "python313-pipdeptree-3.1.1-1.2.noarch.rpm"
RPM_HASH = "373a253dda884e5ae76b318cb4f014e025bab11b23176e266f507e631205593225c1e3d9ea36f149c02dc8db6e6f4694ac83d721e46779a01614a6cd3670be81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pipdeptree \
python3.13dist-pipdeptree \
python313-pipdeptree \
python3dist-pipdeptree"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-packaging \
python313-rich"

inherit rpm
