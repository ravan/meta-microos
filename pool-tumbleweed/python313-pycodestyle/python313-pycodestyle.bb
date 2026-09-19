SUMMARY = "Python style guide checker"
DESCRIPTION = "pycodestyle is a tool to check your Python code against some of the style \
conventions in `PEP 8`. \
 \
This package used to be called ``pep8`` but was renamed to ``pycodestyle`` \
to reduce confusion."
LICENSE = "MIT"

PV = "2.14.0"

RPM_NAME = "python313-pycodestyle-2.14.0-3.5.noarch.rpm"
RPM_HASH = "369745db23ada8e3c3d384f13da3adf9b476c2b828631ff4e5c23dd04239b73f8313a321613469994bcf0e88ae6db2eec9d77536c4c1454d2112dd84d17c278a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pep8 \
python3-pycodestyle \
python3.13dist-pycodestyle \
python313-pep8 \
python313-pycodestyle \
python3dist-pycodestyle"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
