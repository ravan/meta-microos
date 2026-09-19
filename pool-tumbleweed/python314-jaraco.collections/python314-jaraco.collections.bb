SUMMARY = "Tools to work with collections"
DESCRIPTION = "jaraco.collections Tools for working with collections. \
Models and classes to supplement the stdlib ‘collections’ module."
LICENSE = "MIT"

PV = "5.2.1"

RPM_NAME = "python314-jaraco.collections-5.2.1-1.5.noarch.rpm"
RPM_HASH = "ffa5c7a299489cf9f7b9fead03ae8b7b29cffca97a763f443ceb9da3f9d6acc1688720148f10a32b7013e937a8bcacce17c01722c3c45d173bb9b3af56abf11c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jaraco.collections \
python314-jaraco.collections \
python3dist-jaraco.collections"

RDEPENDS:${PN} += "python-abi \
python314-jaraco.text"

inherit rpm
