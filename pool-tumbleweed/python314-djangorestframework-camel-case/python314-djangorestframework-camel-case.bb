SUMMARY = "Camel case JSON support for Django REST framework"
DESCRIPTION = "Camel case JSON support for Django REST framework."
LICENSE = "BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "python314-djangorestframework-camel-case-1.4.2-2.9.noarch.rpm"
RPM_HASH = "c6b2d1d616c8ec971a050bce587bf019ea768d4c419c41c549c61af3b69030825f0df5ad17fd5de3238d03647e7ecb7107549c126880ed7ee995af223c9edd11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-djangorestframework-camel-case \
python314-djangorestframework-camel-case \
python3dist-djangorestframework-camel-case"

RDEPENDS:${PN} += "python-abi"

inherit rpm
