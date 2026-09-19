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

RPM_NAME = "python314-PyMeta3-0.5.1-4.5.noarch.rpm"
RPM_HASH = "045c29fa1ede9e11a8173ac13a3d6516056474541d5b121d9f78ddc91d14c2fa2dea7aa7662c592c9cf46b79d8a10c3965ee7683d65be5f6dde361d842721d00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pymeta3 \
python314-PyMeta3 \
python3dist-pymeta3"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
