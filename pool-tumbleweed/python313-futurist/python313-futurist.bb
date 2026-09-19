SUMMARY = "Useful additions to futures, from the future."
DESCRIPTION = "Useful additions to futures, from the future."
LICENSE = "Apache-2.0"

PV = "3.5.0"

RPM_NAME = "python313-futurist-3.5.0-1.1.noarch.rpm"
RPM_HASH = "42a9117db71625efddda6672092f233c22dbd696dfe78c8fceb12abd35c32eed41e44058b83d019ea7740657907b0492e59376fdbb347c7fcbe5de994d176526"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-futurist \
python3.13dist-futurist \
python313-futurist \
python3dist-futurist"

RDEPENDS:${PN} += "python-abi \
python313-debtcollector"

inherit rpm
