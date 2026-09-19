SUMMARY = "One API for multiple git forges"
DESCRIPTION = "One API for multiple git forges."
LICENSE = "MIT"

PV = "0.63.0"

RPM_NAME = "python314-ogr-0.63.0-1.1.noarch.rpm"
RPM_HASH = "a81fcee024f7322706b2a7372034b71f628d2c3c9a37e1a7e7f451bc41601a2a3bbbc1d56e4bbc2fb6df0e6b43dbda67926832ec2cf4db22e61ce7919a8e67dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ogr \
python314-ogr \
python3dist-ogr"

RDEPENDS:${PN} += "python-abi \
python314-Deprecated \
python314-GitPython \
python314-PyGithub \
python314-PyYAML \
python314-cryptography \
python314-httpx \
python314-pyforgejo \
python314-python-gitlab \
python314-requests \
python314-urllib3"

inherit rpm
