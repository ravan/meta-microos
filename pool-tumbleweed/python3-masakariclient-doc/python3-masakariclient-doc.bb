SUMMARY = "Documentation for OpenStack Masakari API client libary"
DESCRIPTION = "Client library for Masakari built on the Masakari API. It provides a Python API \
(the masakariclient module) and a command-line tool (masakari). \
This package contains the documentation."
LICENSE = "Apache-2.0"

PV = "8.9.0"

RPM_NAME = "python3-masakariclient-doc-8.9.0-1.1.noarch.rpm"
RPM_HASH = "aad25da4da9dd6f64ef297a3fee258006ff7196cd44f5a4363774ef4b3500e38ddb30c7665ff696ba0b9ca627df8358c47a9d2841549a9c3017f9c303b947b24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-masakariclient-doc \
python3-masakariclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
