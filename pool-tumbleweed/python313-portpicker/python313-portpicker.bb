SUMMARY = "A library to choose unique available network ports"
DESCRIPTION = "Portpicker provides an API to find and return an available network port for \
an application to bind to. Ideally suited for use from unittests or for test \
harnesses that launch local servers."
LICENSE = "Apache-2.0"

PV = "1.6.0"

RPM_NAME = "python313-portpicker-1.6.0-3.5.noarch.rpm"
RPM_HASH = "bb35c4025279b4d56b5c8d8438cf051dba651c90792042f1fdc8df355455d7cb7e5e416de2eaa29acd4d3a0f151cefdd9ab6a5dd16ed5d7a8dd1cc0be69e6b31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-portpicker \
python3.13dist-portpicker \
python313-portpicker \
python3dist-portpicker"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
