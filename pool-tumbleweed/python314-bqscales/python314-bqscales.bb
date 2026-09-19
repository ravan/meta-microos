SUMMARY = "Grammar of Graphics in Python"
DESCRIPTION = "Grammar of Graphics in Python for bqplot and other Jupyter widgets \
libraries"
LICENSE = "Apache-2.0"

PV = "0.3.7"

RPM_NAME = "python314-bqscales-0.3.7-1.1.noarch.rpm"
RPM_HASH = "a54346a1089673504f51ff615bb19a6a55774cd38a13a0fb3fc30851eac9be125553b74e9e084264ea2d771025677211d636629a7a042e465def6f890dae1947"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-bqscales \
python314-bqscales \
python3dist-bqscales"

RDEPENDS:${PN} += "python-abi \
python314-ipywidgets \
python314-numpy \
python314-traitlets \
python314-traittypes"

inherit rpm
