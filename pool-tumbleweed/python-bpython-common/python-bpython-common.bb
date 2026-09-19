SUMMARY = "Fancy Interface to the Python Interpreter - common files"
DESCRIPTION = "This package contains files shared between the various versions of \
Bpython. You don't need to install this directly, packages that \
require it will pull it in automatically."
LICENSE = "MIT"

PV = "0.26"

RPM_NAME = "python-bpython-common-0.26-4.2.noarch.rpm"
RPM_HASH = "3264b820c00ef34f3d93e02e5824615142d36a26f6c0393c5abb1acc28609bcd93d55a74bc25b64658392124af554b6d0aecbf250296a9a4c890b2dff429b9f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-bpython-common \
python313-bpython-common \
python314-bpython-common"

RDEPENDS:${PN} += ""

inherit rpm
