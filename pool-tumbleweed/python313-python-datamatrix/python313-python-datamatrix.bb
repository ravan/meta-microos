SUMMARY = "A python library to work with tabular data"
DESCRIPTION = "The datamatrix package provides a high way to work with tabular data in Python. \
Tabular data is datasets that consist of named columns and numbered rows."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.19"

RPM_NAME = "python313-python-datamatrix-1.0.19-1.3.noarch.rpm"
RPM_HASH = "c6e9eb0b7359aaa45ee412cee0a004cb9fbfed69217f33b7dadce72c4e4af220ace53fe3f0e59d17d159bbbef3f36ee271d778ca6717c184a97ca11836bf815c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-datamatrix \
python3.13dist-datamatrix \
python313-python-datamatrix \
python3dist-datamatrix"

RDEPENDS:${PN} += "python-abi \
python313-PrettyTable \
python313-json-tricks \
python313-numpy \
python313-openpyxl \
python313-psutil \
python313-scipy \
python313-tomlkit"

inherit rpm
