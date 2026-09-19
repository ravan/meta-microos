SUMMARY = "DBF file reader for Python"
DESCRIPTION = "DBF is a file format used by databases such dBase, Visual FoxPro, and \
FoxBase+. This library reads DBF files and returns the data as native \
Python data types for further processing. It is primarily intended for \
batch jobs and one-off scripts."
LICENSE = "MIT"

PV = "2.0.7"

RPM_NAME = "python313-dbfread-2.0.7-6.5.noarch.rpm"
RPM_HASH = "e4901c28223ad4e27793b55ff426b94a65169173f064203dbee6586f475ee3b5c49314f53fffc38d98a6ce91d8700d45e16a9d4d2097ff5332486576cb3a0381"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dbfread \
python3.13dist-dbfread \
python313-dbfread \
python3dist-dbfread"

RDEPENDS:${PN} += "python-abi"

inherit rpm
