SUMMARY = "CLI-tool/Python-library for parsing ping command output"
DESCRIPTION = "pingparsing is a CLI-tool/Python-library for parsing ping command output."
LICENSE = "MIT"

PV = "1.4.2"

RPM_NAME = "python314-pingparsing-1.4.2-3.5.noarch.rpm"
RPM_HASH = "8ed4f371cd6852f4621c61a1b94f32230c03842ae80c2357f51abb3e231fffb58640530577e55e4a3f233ee25df681ce76a626bd5d2e77c0a3964a5e311142a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pingparsing \
python314-pingparsing \
python3dist-pingparsing"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-humanreadable \
python314-loguru \
python314-pyparsing \
python314-pytz \
python314-setuptools \
python314-simplejson \
python314-subprocrunner \
python314-typepy"

inherit rpm
