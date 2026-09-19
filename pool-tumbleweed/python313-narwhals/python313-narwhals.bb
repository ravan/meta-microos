SUMMARY = "Extremely lightweight compatibility layer between dataframe libraries"
DESCRIPTION = "Extremely lightweight and extensible compatibility layer between \
dataframe libraries!"
LICENSE = "MIT"

PV = "2.24.0"

RPM_NAME = "python313-narwhals-2.24.0-1.1.noarch.rpm"
RPM_HASH = "683a2159c32eaade863d4ef96e3d40098ea2914965d330189747c5376dd896064f0b0073732f2207e9f003ece20d04e0516e5f2c0e8712b4acc7abe0ae28ffa4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-narwhals \
python3.13dist-narwhals \
python313-narwhals \
python3dist-narwhals"

RDEPENDS:${PN} += "python-abi"

inherit rpm
