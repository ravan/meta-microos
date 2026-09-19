SUMMARY = "Python module for parsing and writing kickstart files"
DESCRIPTION = "Pykickstart is a Python library consisting of a data representation \
of kickstart files, a parser to read files into that representation, \
and a writer to generate kickstart files."
LICENSE = "GPL-2.0-only & MIT"

PV = "3.69"

RPM_NAME = "python313-pykickstart-3.69-1.3.noarch.rpm"
RPM_HASH = "931cec57e3f57f297e54de25d3ad1e6ab02307a0c2a61f5a93e683152ed719d31a4f3dca094376aef11622ab35f00f7f98cc78b5c7f8d4157467754df1ef0515"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pykickstart \
python3.13dist-pykickstart \
python313-pykickstart \
python3dist-pykickstart"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-requests"

inherit rpm
