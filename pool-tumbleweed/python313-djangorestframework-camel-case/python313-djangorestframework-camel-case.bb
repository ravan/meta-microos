SUMMARY = "Camel case JSON support for Django REST framework"
DESCRIPTION = "Camel case JSON support for Django REST framework."
LICENSE = "BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "python313-djangorestframework-camel-case-1.4.2-2.9.noarch.rpm"
RPM_HASH = "ad83bee80f3f92d262a963c9b4d753e7a4fa842a6305e5db5e9c3c898827e519e943bc5b8f1076487326176103a88e0c1d39d1b0529a008930a2a5082e8fdcb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-djangorestframework-camel-case \
python3.13dist-djangorestframework-camel-case \
python313-djangorestframework-camel-case \
python3dist-djangorestframework-camel-case"

RDEPENDS:${PN} += "python-abi"

inherit rpm
