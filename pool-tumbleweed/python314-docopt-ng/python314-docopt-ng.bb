SUMMARY = "Humane command line arguments parser"
DESCRIPTION = "**docopt-ng** helps you create beautiful command-line interfaces. \
 \
docopt-ng is a fork of the original docopt, now maintained by the jazzband \
project. Now with maintenance, typehints, and complete test coverage!"
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python314-docopt-ng-0.9.0-2.5.noarch.rpm"
RPM_HASH = "2cff77624dcaa352cb6c2e51ac11ebdae3cce2e7f043ebcf8a8acb8077b35fd80331ae6e5b1e9d1ab919d4ff02047ad8bc44212b74cb16502be87114b46dad1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-docopt-ng \
python314-docopt-ng \
python3dist-docopt-ng"

RDEPENDS:${PN} += "python-abi"

inherit rpm
