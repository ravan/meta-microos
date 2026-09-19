SUMMARY = "Pythonic argument parser"
DESCRIPTION = "docopt creates command-line interfaces. \
 \
This way one does not need to write repeatable parser-code, \
and instead can write only the help message."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python313-docopt-0.6.2-10.5.noarch.rpm"
RPM_HASH = "3972899caedd2426c0b81710aa105683b054fcc7f78746562e0562073d2711aec3a4b6a9bae30474cb0d1d26c3789d9f609f68146e9395a2f892f1b6b658c31e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-docopt \
python3.13dist-docopt \
python313-docopt \
python3dist-docopt"

RDEPENDS:${PN} += "python-abi"

inherit rpm
