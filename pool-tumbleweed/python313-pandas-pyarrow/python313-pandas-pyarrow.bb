SUMMARY = "The python pandas[pyarrow] extra"
DESCRIPTION = "This package provides the [pyarrow] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "3.0.5"

RPM_NAME = "python313-pandas-pyarrow-3.0.5-2.2.noarch.rpm"
RPM_HASH = "2feedb3bfd54529e66b3c2a16597bd180cda713633e3deb02cccffe75c2fcc22450d1556b23226bc384efee974a3edb8795183aaab95aecef48b1191ddbe0f01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-pyarrow \
python313-pandas-pyarrow"

RDEPENDS:${PN} += "python313-pandas \
python313-pyarrow"

inherit rpm
