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

RPM_NAME = "python314-docformatter-1.7.8-1.2.noarch.rpm"
RPM_HASH = "a8e89c8b5735d2b2cf8aa210ada59d33a23112a2182de2d6691184d73797a6592f4935bf33831d07905db79cbee2cd08dab7d560f99e5de66ab5c6aa462d8033"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-docformatter \
python314-docformatter \
python3dist-docformatter"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-charset-normalizer \
update-alternatives"

inherit rpm
