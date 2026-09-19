SUMMARY = "One API for multiple git forges"
DESCRIPTION = "One API for multiple git forges."
LICENSE = "MIT"

PV = "0.63.0"

RPM_NAME = "python313-ogr-0.63.0-1.1.noarch.rpm"
RPM_HASH = "8babf0cb6f1d6307645a72720add612f1c21848e4ec8cc5ca8d938d89718b13f9e00a5c4fa8b3f2d1e47587890219799537ccb9024eecddbc9b252d3a37424ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ogr \
python3.13dist-ogr \
python313-ogr \
python3dist-ogr"

RDEPENDS:${PN} += "python-abi \
python313-Deprecated \
python313-GitPython \
python313-PyGithub \
python313-PyYAML \
python313-cryptography \
python313-httpx \
python313-pyforgejo \
python313-python-gitlab \
python313-requests \
python313-urllib3"

inherit rpm
