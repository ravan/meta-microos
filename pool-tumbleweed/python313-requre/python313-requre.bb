SUMMARY = "Python libray for storing and using objects for testing"
DESCRIPTION = "Library for testing python code what allows store output of \
various objects and use stored data for testing."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "python313-requre-0.9.1-2.6.noarch.rpm"
RPM_HASH = "87b0b160050230913658680d60bba369c3bfc9034eb3de211e0fbbcecafbb86cf7dbf8a4f754e92c0b8f160669ebe8c2c771eb6fd2d4d4acf4098f830580ec02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requre \
python3.13dist-requre \
python313-requre \
python3dist-requre"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-GitPython \
python313-PyYAML \
python313-click \
python313-httpx \
python313-pytest \
python313-requests \
update-alternatives"

inherit rpm
