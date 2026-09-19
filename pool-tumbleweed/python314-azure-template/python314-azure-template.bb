SUMMARY = "Microsoft Azure Template Package Client Library for Python"
DESCRIPTION = "This template package matches necessary patterns that the development team \
has established to create a unified SDK. The packages contained herein can \
be installed singly or as part of the azure namespace. Any other introductory \
text should go here. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-template-1.0.0-1.1.noarch.rpm"
RPM_HASH = "87e674219d095b61d4f1304651523062f91445dd0d00ae4fef0a50b297770e4bf5d3f2359926a1471b4a46d7d48d5623060acc0a19548d2f3593f81c0455270d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-template \
python314-azure-template \
python3dist-azure-template"

RDEPENDS:${PN} += "-python314-azure-core >= 1.31.0 with python314-azure-core < 2.0.0 \
python-abi"

inherit rpm
