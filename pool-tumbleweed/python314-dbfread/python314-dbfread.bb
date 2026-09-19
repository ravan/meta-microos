SUMMARY = "DBF file reader for Python"
DESCRIPTION = "DBF is a file format used by databases such dBase, Visual FoxPro, and \
FoxBase+. This library reads DBF files and returns the data as native \
Python data types for further processing. It is primarily intended for \
batch jobs and one-off scripts."
LICENSE = "MIT"

PV = "2.0.7"

RPM_NAME = "python314-dbfread-2.0.7-6.5.noarch.rpm"
RPM_HASH = "ccf6b86bbd5d0223205924c948a637a7177d3319c21394d4b87920aa05875cd6ea498d4ad595805e8ea3f416389a0f654bbc3a37107cc6f311b1250cb3462337"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dbfread \
python314-dbfread \
python3dist-dbfread"

RDEPENDS:${PN} += "python-abi"

inherit rpm
