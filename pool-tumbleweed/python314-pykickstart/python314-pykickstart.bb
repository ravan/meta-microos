SUMMARY = "Python module for parsing and writing kickstart files"
DESCRIPTION = "Pykickstart is a Python library consisting of a data representation \
of kickstart files, a parser to read files into that representation, \
and a writer to generate kickstart files."
LICENSE = "GPL-2.0-only & MIT"

PV = "3.69"

RPM_NAME = "python314-pykickstart-3.69-1.3.noarch.rpm"
RPM_HASH = "aa889c707573099371ac4e8002d08a101948653c91bec794ec5a7c8c7353808ce4c2716cde76b99e085d40a5b57e83ad00560f432b30580a2278b79d67612ffc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pykickstart \
python314-pykickstart \
python3dist-pykickstart"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-requests"

inherit rpm
