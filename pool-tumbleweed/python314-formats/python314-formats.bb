SUMMARY = "Support multiple formats with ease"
DESCRIPTION = "Formats will provide you with a consistent API to parse and compose data."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python314-formats-0.1.1-2.5.noarch.rpm"
RPM_HASH = "26f4d867d152ec1cbc15ebec4380188f25a00e87c40641e6f057b166ae92712986d3809c03d87006b7d6221420ba2c22bea03c0fbacca8b420e4f68bfdf4cd6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-formats \
python314-formats \
python3dist-formats"

RDEPENDS:${PN} += "python-abi"

inherit rpm
