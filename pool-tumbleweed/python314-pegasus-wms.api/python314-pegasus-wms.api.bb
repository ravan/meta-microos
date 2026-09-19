SUMMARY = "Pegasus Workflow Management System Python API"
DESCRIPTION = "This package contains the Python APIs for Pegasus WMS, including: \
 \
The DAX API (Versions 2 and 3) \
The PDAX API (Version 2) \
The monitoring API \
The Stampede database API \
The Pegasus statistics API \
The Pegasus plots API \
Misc. Pegasus utilities \
The pegasus service, including the ensemble manager and dashboard"
LICENSE = "Apache-2.0"

PV = "5.1.2"

RPM_NAME = "python314-pegasus-wms.api-5.1.2-1.2.noarch.rpm"
RPM_HASH = "e20cd8e5a6e43b2cccba40220de15579b902ecd857594ed85219ebc2fff6758afa253c024b8be69f8b6eea180c44d7f89cdfcb43f120cb80b4413516b6ac6ca7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pegasus-wms.api \
python314-pegasus-wms.api \
python3dist-pegasus-wms.api"

RDEPENDS:${PN} += "python-abi \
python314-pegasus-wms.common"

inherit rpm
