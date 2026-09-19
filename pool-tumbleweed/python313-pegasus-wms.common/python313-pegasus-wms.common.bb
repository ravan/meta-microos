SUMMARY = "Pegasus Workflow Management System Python Commons"
DESCRIPTION = "This package contains common files for the Python APIs for Pegasus WMS."
LICENSE = "Apache-2.0"

PV = "5.1.2"

RPM_NAME = "python313-pegasus-wms.common-5.1.2-1.2.noarch.rpm"
RPM_HASH = "e62e90eb6954e7efec69324c866b897008c1786a027a1e710740b4f337d0763390b3e6eb5811f71ea9162c19678e8439059fdc31e9082fb21c4bd2d5a3344bfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pegasus-wms.common \
python3.13dist-pegasus-wms.common \
python313-pegasus-wms.common \
python3dist-pegasus-wms.common"

RDEPENDS:${PN} += "python-abi \
python313-PyYAML"

inherit rpm
