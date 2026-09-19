SUMMARY = "Tools to analyze security characteristics of MS Office and OLE files"
DESCRIPTION = "Python tools to analyze security characteristics of MS Office and OLE files (also called Structured Storage, Compound File Binary Format or Compound Document File Format), for Malware Analysis and Incident Response (DFIR)"
LICENSE = "BSD-2-Clause & MIT"

PV = "0.60.2"

RPM_NAME = "python314-oletools-0.60.2-2.5.noarch.rpm"
RPM_HASH = "61a9ee60fefbeb62d26afa74a739f5488712ed7fe842deed14bae113250a110e0c0b168e01caa753f0821c78491ef0dd7b31c001c075bab984707e4efa78858a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-oletools \
python314-oletools \
python3dist-oletools"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-colorclass \
python314-easygui \
python314-msoffcrypto-tool \
python314-olefile \
python314-pyparsing \
update-alternatives"

inherit rpm
