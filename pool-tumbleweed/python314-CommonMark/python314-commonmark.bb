SUMMARY = "Python parser for the CommonMark Markdown spec"
DESCRIPTION = "Pure Python port of jgm's stmd.js, a Markdown parser and renderer for the \
CommonMark specification, using only native modules."
LICENSE = "BSD-3-Clause"

PV = "0.9.2"

RPM_NAME = "python314-CommonMark-0.9.2-1.2.noarch.rpm"
RPM_HASH = "a5c00c4f3b1e0b8c5c045947bb718ea422ca9b231a82bd4713db2ae5fc99f71851d1c5d26fc752597af56871bfb1e5284692094431954fa3d1579a84f78f6964"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmark-python \
python3.14dist-commonmark \
python314-CommonMark \
python314-commonmark \
python3dist-commonmark"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
