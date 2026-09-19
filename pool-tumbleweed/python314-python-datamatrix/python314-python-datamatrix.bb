SUMMARY = "A python library to work with tabular data"
DESCRIPTION = "The datamatrix package provides a high way to work with tabular data in Python. \
Tabular data is datasets that consist of named columns and numbered rows."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.19"

RPM_NAME = "python314-python-datamatrix-1.0.19-1.3.noarch.rpm"
RPM_HASH = "782e5a50ce2215041278a4da6e85058b79dfbed45d9d42f3612eeec4cf46f8dcdec08ada4068f23c084a57a512836e406e076dfb1cfe56330e4b02b471aab19c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-datamatrix \
python314-python-datamatrix \
python3dist-datamatrix"

RDEPENDS:${PN} += "python-abi \
python314-PrettyTable \
python314-json-tricks \
python314-numpy \
python314-openpyxl \
python314-psutil \
python314-scipy \
python314-tomlkit"

inherit rpm
