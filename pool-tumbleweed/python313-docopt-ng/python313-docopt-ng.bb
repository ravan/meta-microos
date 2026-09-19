SUMMARY = "Humane command line arguments parser"
DESCRIPTION = "**docopt-ng** helps you create beautiful command-line interfaces. \
 \
docopt-ng is a fork of the original docopt, now maintained by the jazzband \
project. Now with maintenance, typehints, and complete test coverage!"
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python313-docopt-ng-0.9.0-2.5.noarch.rpm"
RPM_HASH = "0256f4589b7fc4aed067db2038d9e7d58c0d885efcaded8b20c29f86845331bf38f84b3448ecf7b870d384c52dc12ad85c4c3cd8051dc2d41ef053788d99ec64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-docopt-ng \
python3.13dist-docopt-ng \
python313-docopt-ng \
python3dist-docopt-ng"

RDEPENDS:${PN} += "python-abi"

inherit rpm
