SUMMARY = "CLI-tool/Python-library for parsing ping command output"
DESCRIPTION = "pingparsing is a CLI-tool/Python-library for parsing ping command output."
LICENSE = "MIT"

PV = "1.4.2"

RPM_NAME = "python313-pingparsing-1.4.2-3.5.noarch.rpm"
RPM_HASH = "dd723427fc1f9cc91ecb6989b4c4393372836307796ab438817aef54561c3b0d509235b2280c4e42381fef6788f60bc3c27e7189fa94ff211b9fdff20ac9036f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pingparsing \
python3.13dist-pingparsing \
python313-pingparsing \
python3dist-pingparsing"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-humanreadable \
python313-loguru \
python313-pyparsing \
python313-pytz \
python313-setuptools \
python313-simplejson \
python313-subprocrunner \
python313-typepy"

inherit rpm
