SUMMARY = "Pegasus Workflow Management System Python Commons"
DESCRIPTION = "This package contains common files for the Python APIs for Pegasus WMS."
LICENSE = "Apache-2.0"

PV = "5.1.2"

RPM_NAME = "python314-pegasus-wms.common-5.1.2-1.2.noarch.rpm"
RPM_HASH = "2e55c28b636bde0bb8ae778c544c588f7cd05a99668875101ae69579b98e319c0c45fd33772918253fbaa7b9dff5574026a8634f6788c69b1401c59e5b050974"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pegasus-wms.common \
python314-pegasus-wms.common \
python3dist-pegasus-wms.common"

RDEPENDS:${PN} += "python-abi \
python314-PyYAML"

inherit rpm
