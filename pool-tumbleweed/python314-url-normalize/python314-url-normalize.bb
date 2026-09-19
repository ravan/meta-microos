SUMMARY = "URL normalization for Python"
DESCRIPTION = "URL normalization for Python."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python314-url-normalize-3.0.0-1.2.noarch.rpm"
RPM_HASH = "49d7f4b39f8ff48760a38bd7488323a1c0fed6c3c7660593abdcf9cbfe26e3088ac2cebbf944782e536c43dce54e10d4aac6f34b6f51507921e42db253e89981"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-url-normalize \
python314-url-normalize \
python3dist-url-normalize"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-idna \
update-alternatives"

inherit rpm
