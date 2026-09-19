SUMMARY = "Pattern-matching language based on OMeta for Python 3 and 2"
DESCRIPTION = "PyMeta is an implementation of OMeta, an object-oriented pattern-matching \
language developed by Alessandro Warth \
(http://www.cs.ucla.edu/~awarth/ometa/). PyMeta provides a compact syntax based \
on Parsing Expression Grammars (PEGs) for common lexing, parsing and \
tree-transforming activities in a way that's easy to reason about for Python \
programmers. \
 \
It is a fork of PyMeta 0.5.0 that supports Python 2 and 3."
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "python313-PyMeta3-0.5.1-4.5.noarch.rpm"
RPM_HASH = "5e33724da12e5cdc514a11b1a0bf89ff443e1de7e0c78d027bc4a7960622aebe5229a6ff0e004d5573da91f08bcf99c2007b359af6074344e6f09532f1bc84d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyMeta3 \
python3.13dist-pymeta3 \
python313-PyMeta3 \
python3dist-pymeta3"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
