SUMMARY = "Documentation for python-curl"
DESCRIPTION = "This module provides bindings for the cURL library. \
 \
This package contains documentation and examples."
LICENSE = "LGPL-2.1-or-later & MIT"

PV = "7.45.6"

RPM_NAME = "python-pycurl-doc-7.45.6-2.6.noarch.rpm"
RPM_HASH = "41d496b8497271a9c12900dba9da9307705b8cf6e6ef293957172918831e09bf8b1b4d97b46cc7a4d4c16cc700b53c861e1a05bb10738c5e3c8db85b4420e4b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-pycurl-doc \
python313-pycurl-doc \
python314-pycurl-doc"

RDEPENDS:${PN} += ""

inherit rpm
