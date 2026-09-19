SUMMARY = "Cross-python shutil.which functionality"
DESCRIPTION = "This is a shim for the 'shutil.which' function designed to work \
across multiple versions of Python and inside of windows, and \
originally done for Cookiecutter. The code for Python 2.x is based on \
Python 3 code that was extracted from source."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "python314-whichcraft-0.6.1-3.5.noarch.rpm"
RPM_HASH = "cd076bef9188a4beb2d2f33fdd1d9a035a1b5878ffda2e78409b6ea142c1448fa4915f0cea9b7dadd29455d74f67000949ee0ad5d0199a10daff723616f5c176"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-whichcraft \
python314-whichcraft \
python3dist-whichcraft"

RDEPENDS:${PN} += "python-abi"

inherit rpm
