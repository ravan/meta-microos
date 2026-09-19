SUMMARY = "Cross-python shutil.which functionality"
DESCRIPTION = "This is a shim for the 'shutil.which' function designed to work \
across multiple versions of Python and inside of windows, and \
originally done for Cookiecutter. The code for Python 2.x is based on \
Python 3 code that was extracted from source."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "python313-whichcraft-0.6.1-3.5.noarch.rpm"
RPM_HASH = "4ca75511c4b687a948b3b45647227429099cb9f0b08c5d8531e8fdf2cf11b789d4b9954ecf93e0968b3e8643f31520f4471f5d653252f83a60d960863c8d2663"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-whichcraft \
python3.13dist-whichcraft \
python313-whichcraft \
python3dist-whichcraft"

RDEPENDS:${PN} += "python-abi"

inherit rpm
