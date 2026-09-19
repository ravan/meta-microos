SUMMARY = "Utility to re-format docstrings per PEP 257"
DESCRIPTION = "Docformatter currently automatically formats docstrings to follow a \
subset of the PEP 257 conventions. Below are the relevant items quoted \
from PEP 257. \
 \
- For consistency, always use triple double quotes around docstrings. \
- Triple quotes are used even though the string fits on one line. \
- Multi-line docstrings consist of a summary line just like a one-line \
  docstring, followed by a blank line, followed by a more elaborate \
  description. \
- The BDFL recommends inserting a blank line between the last paragraph \
  in a multi-line docstring and its closing quotes, placing the closing \
  quotes on a line by themselves. \
 \
docformatter also handles some of the PEP 8 conventions. \
 \
- Don't write string literals that rely on significant trailing \
  whitespace. Such trailing whitespace is visually indistinguishable \
  and some editors (or more recently, reindent.py) will trim them."
LICENSE = "MIT"

PV = "1.7.8"

RPM_NAME = "python313-docformatter-1.7.8-1.2.noarch.rpm"
RPM_HASH = "a65a3d35b5f46baac130e418a5c8a57e8001c4bb846cc78a514073d92397701e2dc816f55b0d473c554f1c5d85ea9862e68d3bbedc26bbbb4fa4f3d613317fc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-docformatter \
python3.13dist-docformatter \
python313-docformatter \
python3dist-docformatter"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-charset-normalizer \
update-alternatives"

inherit rpm
