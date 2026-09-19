SUMMARY = "Python package to capture C-level output in context managers"
DESCRIPTION = "Wurlitzer is a python package to capture C-level \
output in context managers."
LICENSE = "MIT"

PV = "3.1.1"

RPM_NAME = "python313-wurlitzer-3.1.1-2.7.noarch.rpm"
RPM_HASH = "99ac28e7d22043b3cac322944599b246715cc1029b20983ab58544bb5ca88a53ccd556dee11d789bd3c0d7213fff803d538703f4fa39e4a067ce983d3f89ca7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wurlitzer \
python3.13dist-wurlitzer \
python313-wurlitzer \
python3dist-wurlitzer"

RDEPENDS:${PN} += "python-abi"

inherit rpm
