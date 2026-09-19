SUMMARY = "Library for effortlessly building pretty command line interfaces"
DESCRIPTION = "A Python library for effortlessly building pretty command line interfaces."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "python314-questionary-2.1.1-1.5.noarch.rpm"
RPM_HASH = "0bb17327e16f5ab82c4d6b0382ca6a36e5150e224501ab93c443ac6f627e5bb242b5c0608beed7028e9404abaf0fa04a733abdfc3817aee0d2720e1b80319ad9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-questionary \
python314-questionary \
python3dist-questionary"

RDEPENDS:${PN} += "python-abi \
python3-prompt-toolkit"

inherit rpm
