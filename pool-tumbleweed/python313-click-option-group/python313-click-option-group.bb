SUMMARY = "Option groups missing in Click"
DESCRIPTION = "Option groups missing in Click"
LICENSE = "BSD-3-Clause"

PV = "0.5.9"

RPM_NAME = "python313-click-option-group-0.5.9-1.6.noarch.rpm"
RPM_HASH = "24c384d27f5e0071df5b6a7eb92312855ba664f96062827b4ca1be936bc98ed5b3be8540f66f36f2bde9e52893a9f226aff48d926ec879a031205c02c8c68ca4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-click-option-group \
python3.13dist-click-option-group \
python313-click-option-group \
python3dist-click-option-group"

RDEPENDS:${PN} += "python-abi \
python313-click"

inherit rpm
