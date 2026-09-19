SUMMARY = "The python xarray[viz] extra"
DESCRIPTION = "The [viz] extra for xarray, N-D labeled arrays and datasets in Python \
 \
Except nc-time-axis and cartopy, because they're not packaged yet. \
Use `pip --user install nc-time-axis cartopy` to install from PyPI, if needed."
LICENSE = "Apache-2.0"

PV = "2026.02.0"

RPM_NAME = "python314-xarray-viz-2026.02.0-3.1.noarch.rpm"
RPM_HASH = "2aa36343496c2937c2f874f467b20c5cd53644704f31f7a7a91d2b9d2cadc2bd578c027db15cffd63b56112119056a982c0e4bffa9e82e390bdf0e252e58b739"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-xarray-viz"

RDEPENDS:${PN} += "python314-matplotlib \
python314-seaborn \
python314-xarray"

inherit rpm
