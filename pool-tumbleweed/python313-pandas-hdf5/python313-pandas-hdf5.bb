SUMMARY = "The python pandas[hdf5] extra"
DESCRIPTION = "This package provides the [hdf5] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "3.0.5"

RPM_NAME = "python313-pandas-hdf5-3.0.5-2.2.noarch.rpm"
RPM_HASH = "475d2cfec6a933ddcb959eface18128c61ace08cd710125d99d44ebcf7da8ca1f3e5cb5ba47ea61b3110f1b70bbd5c61d263107cf7182926c50011b9952f0c6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-hdf5 \
python313-pandas-hdf5"

RDEPENDS:${PN} += "python313-blosc \
python313-pandas \
python313-tables"

inherit rpm
