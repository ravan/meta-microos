SUMMARY = "The python xarray[viz] extra"
DESCRIPTION = "The [viz] extra for xarray, N-D labeled arrays and datasets in Python \
 \
Except nc-time-axis and cartopy, because they're not packaged yet. \
Use `pip --user install nc-time-axis cartopy` to install from PyPI, if needed."
LICENSE = "Apache-2.0"

PV = "2026.02.0"

RPM_NAME = "python313-xarray-viz-2026.02.0-3.1.noarch.rpm"
RPM_HASH = "e1d2e72ad61e37a444a3e8d5eae902053be6651d5723e21d3405ffc83503082b85a7c8eef3be3cb22d24e79296e643353313765c84f8521196fbbb6eb2ed316f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xarray-viz \
python313-xarray-viz"

RDEPENDS:${PN} += "python313-matplotlib \
python313-seaborn \
python313-xarray"

inherit rpm
