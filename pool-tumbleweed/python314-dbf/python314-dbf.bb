SUMMARY = "Pure python package for reading/writing dBase, FoxPro, and Visual FoxPro .dbf"
DESCRIPTION = "Pure python package for reading/writing dBase, FoxPro, and Visual FoxPro .dbf \
files (including memos) \
 \
Currently supports dBase III, Clipper, FoxPro, and Visual FoxPro tables. Text is \
returned as unicode, and codepage settings in tables are honored. Memos and Null \
fields are supported."
LICENSE = "BSD-3-Clause"

PV = "0.99.11"

RPM_NAME = "python314-dbf-0.99.11-1.3.noarch.rpm"
RPM_HASH = "a32e4ce8f8bf13d40a039008b1cec4caa0fb3f7320e3bc916fd26183db47ea83fdcfdb627b87c412d21f2432a46a6214aa309c34dacda1105ee76cbb475aad95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dbf \
python314-dbf \
python3dist-dbf"

RDEPENDS:${PN} += "python-abi \
python314-aenum \
python314-pytz"

inherit rpm
