SUMMARY = "Python package to capture C-level output in context managers"
DESCRIPTION = "Wurlitzer is a python package to capture C-level \
output in context managers."
LICENSE = "MIT"

PV = "3.1.1"

RPM_NAME = "python314-wurlitzer-3.1.1-2.7.noarch.rpm"
RPM_HASH = "4dc5bf4a8654fb3c2a18196aa03f1f8f76673e4b3553fa83960484e36d78254728a0f6fac0b9dd6481b223c385a4755e8021d4f7f9be0971157d2a4cd26d4a2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-wurlitzer \
python314-wurlitzer \
python3dist-wurlitzer"

RDEPENDS:${PN} += "python-abi"

inherit rpm
