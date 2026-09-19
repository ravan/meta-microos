SUMMARY = "Parse Python docstrings in reST, Google and Numpydoc format"
DESCRIPTION = "Parse Python docstrings. Currently support ReST, Google, Numpydoc-style and \
Epydoc docstrings."
LICENSE = "MIT"

PV = "0.18.0"

RPM_NAME = "python313-docstring-parser-0.18.0-1.3.noarch.rpm"
RPM_HASH = "ba8c84248176f22736159c8e372808325b2edec62bddd9e80cc54c51e04ed962ac90d2ee7c278ab58f9156068611728680fcf8285f4298825b8740d587dac48b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-docstring-parser \
python3.13dist-docstring-parser \
python313-docstring-parser \
python3dist-docstring-parser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
