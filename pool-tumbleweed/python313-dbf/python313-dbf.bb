SUMMARY = "Pure python package for reading/writing dBase, FoxPro, and Visual FoxPro .dbf"
DESCRIPTION = "Pure python package for reading/writing dBase, FoxPro, and Visual FoxPro .dbf \
files (including memos) \
 \
Currently supports dBase III, Clipper, FoxPro, and Visual FoxPro tables. Text is \
returned as unicode, and codepage settings in tables are honored. Memos and Null \
fields are supported."
LICENSE = "BSD-3-Clause"

PV = "0.99.11"

RPM_NAME = "python313-dbf-0.99.11-1.3.noarch.rpm"
RPM_HASH = "83984b2aa4cf92f720c464d16b3060f52f439b1452e62ef11a7a47515ec6b33166f15710a2a86f1351eb6aa9ce384d8e7fc9ace4200d696afd5261a47d6b0417"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dbf \
python3.13dist-dbf \
python313-dbf \
python3dist-dbf"

RDEPENDS:${PN} += "python-abi \
python313-aenum \
python313-pytz"

inherit rpm
