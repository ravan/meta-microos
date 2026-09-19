SUMMARY = "Multi-language pre-commit hooks"
DESCRIPTION = "A framework for managing and maintaining multi-language pre-commit hooks."
LICENSE = "MIT"

PV = "4.6.2"

RPM_NAME = "python314-pre-commit-4.6.2-1.1.noarch.rpm"
RPM_HASH = "3576fc0b85c8261ef18e15a909bb64b8701527a1f9f28e434fb6c9604d04955f8efaed684f6c0cf3bc1cb9c9e9cdb2be3af9990dc1c0d1811d707aec5c0036b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pre-commit \
python314-pre-commit \
python3dist-pre-commit"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-PyYAML \
python314-cfgv \
python314-identify \
python314-nodeenv \
python314-virtualenv \
update-alternatives"

inherit rpm
