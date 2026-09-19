SUMMARY = "The python pandas[feather] extra"
DESCRIPTION = "This package provides the [feather] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "3.0.5"

RPM_NAME = "python313-pandas-feather-3.0.5-2.2.noarch.rpm"
RPM_HASH = "d4d55547d916c74e67f6a30b3e6d57cfa0298444559fd01e196d02b1685938f5d037e7a2ebdbfb4b8f07ffe2c987175be240208bfb45922f07e79cb8f7b47f99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-feather \
python313-pandas-feather"

RDEPENDS:${PN} += "python313-pandas \
python313-pyarrow"

inherit rpm
