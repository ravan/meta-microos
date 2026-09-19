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

RPM_NAME = "python314-pydocstyle-6.3.0-4.2.noarch.rpm"
RPM_HASH = "1508cc10e7af0240d929806ae82a602e039d337e8c9d898f53dc6ffdd92908079e43d30f7ac679232f43564da32a115789665cc279c38449ce702205fc449fc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pydocstyle \
python314-pep257 \
python314-pydocstyle \
python3dist-pydocstyle"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-snowballstemmer \
update-alternatives"

inherit rpm
