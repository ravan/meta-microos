SUMMARY = "Utility to check API integrity in python libraries"
DESCRIPTION = "Utility to check API integrity in Python libraries."
LICENSE = "MIT"

PV = "0.0.6"

RPM_NAME = "python313-pyux-0.0.6-2.5.noarch.rpm"
RPM_HASH = "8ac97ac11a96d0c8ecd63279f089ee3c8f035cd35007f4a38dbca1551002beb7c4923571784085a9c0640ece42cfdb3a1401ac7778fc8f57e8e6d47b4a95f951"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyux \
python3.13dist-pyux \
python313-pyux \
python3dist-pyux"

RDEPENDS:${PN} += "python-abi"

inherit rpm
