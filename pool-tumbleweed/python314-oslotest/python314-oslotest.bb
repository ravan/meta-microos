SUMMARY = "OpenStack test framework"
DESCRIPTION = "The Oslo Test framework provides common fixtures, support for debugging, and \
better support for mocking results."
LICENSE = "Apache-2.0"

PV = "6.1.1"

RPM_NAME = "python314-oslotest-6.1.1-1.2.noarch.rpm"
RPM_HASH = "35edbb93341ce96de64b429398cb9d8cb3f2e70fb77b23ab6eba2a6e156bbb2d4ea694dbcdade9006fda1214153f73cdc1fbb949cdc4119eb55e83fb4cfc35d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-oslotest \
python314-oslotest \
python3dist-oslotest"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
python-abi \
python314-fixtures \
update-alternatives"

inherit rpm
