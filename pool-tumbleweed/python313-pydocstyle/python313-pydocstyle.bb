SUMMARY = "Python docstring style checker"
DESCRIPTION = "pydocstyle is a static analysis tool for checking compliance with \
Python docstring conventions. \
 \
pydocstyle supports most of PEP 257 out of the box, but it should not \
be considered a reference implementation. \
 \
The framework for checking docstring style is flexible, and custom \
checks can be easily added, for example to cover NumPy docstring \
conventions."
LICENSE = "MIT"

PV = "6.3.0"

RPM_NAME = "python313-pydocstyle-6.3.0-4.2.noarch.rpm"
RPM_HASH = "17153aed15aa852b7be25a5585352a0bdb5a72de794f7d98557bc6fd97cddc18be7ca0fb1c18cf819058985cf6ecc49a555915ce5041251224a4404e9069193d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pep257 \
python3-pydocstyle \
python3.13dist-pydocstyle \
python313-pep257 \
python313-pydocstyle \
python3dist-pydocstyle"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-snowballstemmer \
update-alternatives"

inherit rpm
