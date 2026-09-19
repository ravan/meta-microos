SUMMARY = "A dot-accessible dictionary"
DESCRIPTION = "A dot-accessible dictionary (a la JavaScript objects)."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python313-munch-4.0.0-3.5.noarch.rpm"
RPM_HASH = "b932427947d4d0c061a938509be7e8ff3710fff13d0778673db096eabc6c503a5c0b679322585f7c035d20018a5ddd56e2cd1f045b8e389811ce43a93f92cf68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-munch \
python3.13dist-munch \
python313-munch \
python3dist-munch"

RDEPENDS:${PN} += "python-abi"

inherit rpm
