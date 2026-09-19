SUMMARY = "CSV Tools for Django REST Framework"
DESCRIPTION = "CSV Tools for Django REST Framework"
LICENSE = "BSD-1-Clause"

PV = "3.0.2"

RPM_NAME = "python313-djangorestframework-csv-3.0.2-1.5.noarch.rpm"
RPM_HASH = "b37a038b75b06c0bfe17bbb0cbe39a97f01d2462f8abb93ff682f27efb08bc7f4845181b4627d69b9b4ebd61bd34fb3dc3cd3346862dddb6ba7dfc18644dee63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-djangorestframework-csv \
python3.13dist-djangorestframework-csv \
python313-djangorestframework-csv \
python3dist-djangorestframework-csv"

RDEPENDS:${PN} += "python-abi \
python313-djangorestframework"

inherit rpm
