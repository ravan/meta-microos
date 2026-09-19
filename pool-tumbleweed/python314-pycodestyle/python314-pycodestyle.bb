SUMMARY = "Python style guide checker"
DESCRIPTION = "pycodestyle is a tool to check your Python code against some of the style \
conventions in `PEP 8`. \
 \
This package used to be called ``pep8`` but was renamed to ``pycodestyle`` \
to reduce confusion."
LICENSE = "MIT"

PV = "2.14.0"

RPM_NAME = "python314-pycodestyle-2.14.0-3.5.noarch.rpm"
RPM_HASH = "2679f7b96d4e0dbdef4b51a158283b04160c104ded93facfbdbf9528c7041c102f78d7f1f4802258cbf5bef786d6f5cfdae54da78a9f13b0588e4f9acb442457"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pycodestyle \
python314-pep8 \
python314-pycodestyle \
python3dist-pycodestyle"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
