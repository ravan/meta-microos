SUMMARY = "The python pandas[excel] extra"
DESCRIPTION = "This package provides the [excel] extra for python-pandas. \
(Except for pyxlsb and calamine which are not available as openSUSE rpm package)"
LICENSE = "BSD-3-Clause"

PV = "3.0.5"

RPM_NAME = "python313-pandas-excel-3.0.5-2.2.noarch.rpm"
RPM_HASH = "035c77898b746b06976c97a8533a941e532f4ccd5134c76662c5699d7bd16a4a683aff8e90ccc441c56496b30d1a265cbd85a0ba096e73730c4f02487053e96a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-excel \
python313-pandas-excel"

RDEPENDS:${PN} += "python313-XlsxWriter \
python313-odfpy \
python313-openpyxl \
python313-pandas \
python313-xlrd"

inherit rpm
