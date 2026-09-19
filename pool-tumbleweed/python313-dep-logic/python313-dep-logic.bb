SUMMARY = "Python dependency specifications supporting logical operations"
DESCRIPTION = "Python dependency specifications supporting logical operations. \
 \
This library allows logic operations on version specifiers and environment markers."
LICENSE = "Apache-2.0"

PV = "0.7.1"

RPM_NAME = "python313-dep-logic-0.7.1-1.1.noarch.rpm"
RPM_HASH = "95c0ee1dc76e8ec8741cbc32081a1cb4f495a4b66178c602273ce73b086fbe6e2bcac4a91f002491c0df49aaea7ebd2ef4009236ce2fe956cdd0a018e31396a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dep-logic \
python3.13dist-dep-logic \
python313-dep-logic \
python3dist-dep-logic"

RDEPENDS:${PN} += "python-abi \
python313-packaging"

inherit rpm
