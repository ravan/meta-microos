SUMMARY = "Pythonic argument parser"
DESCRIPTION = "docopt creates command-line interfaces. \
 \
This way one does not need to write repeatable parser-code, \
and instead can write only the help message."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python314-docopt-0.6.2-10.5.noarch.rpm"
RPM_HASH = "41e4f04cc87de6b056c6e88d6082d47713546f5b27a124ed050c932e528b1042844d8feb48aa5d8c0485300570614f12e3071e85a8dc26ed153aee50e0dfabdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-docopt \
python314-docopt \
python3dist-docopt"

RDEPENDS:${PN} += "python-abi"

inherit rpm
