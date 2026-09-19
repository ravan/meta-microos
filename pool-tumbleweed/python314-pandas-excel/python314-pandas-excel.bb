SUMMARY = "The python pandas[excel] extra"
DESCRIPTION = "This package provides the [excel] extra for python-pandas. \
(Except for pyxlsb and calamine which are not available as openSUSE rpm package)"
LICENSE = "BSD-3-Clause"

PV = "3.0.5"

RPM_NAME = "python314-pandas-excel-3.0.5-2.2.noarch.rpm"
RPM_HASH = "53dd03c1652f79218a208e22f65bdb2965a7a2bb2be0cc430cd8140ebb9d4b31216ce3f00189a6779888e9ffcc36b6997f5ca84ee62b7bb4e16111c54362c092"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-pandas-excel"

RDEPENDS:${PN} += "python314-XlsxWriter \
python314-odfpy \
python314-openpyxl \
python314-pandas \
python314-xlrd"

inherit rpm
