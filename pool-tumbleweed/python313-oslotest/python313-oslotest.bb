SUMMARY = "OpenStack test framework"
DESCRIPTION = "The Oslo Test framework provides common fixtures, support for debugging, and \
better support for mocking results."
LICENSE = "Apache-2.0"

PV = "6.1.1"

RPM_NAME = "python313-oslotest-6.1.1-1.2.noarch.rpm"
RPM_HASH = "827534b7eb83b3b2af5f61b40bff51574fcb9bbd4dbf1f7efb7ae3c52a2003fbc096c86e4be77019fc697f5e9688dc32b717a06d6cb625b19bc52b0184c5bbf0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslotest \
python3.13dist-oslotest \
python313-oslotest \
python3dist-oslotest"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
python-abi \
python313-fixtures \
update-alternatives"

inherit rpm
