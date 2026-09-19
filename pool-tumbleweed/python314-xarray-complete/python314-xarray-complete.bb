SUMMARY = "The python xarray[complete] extra"
DESCRIPTION = "The [complete] extra for xarray, N-D labeled arrays and datasets in Python"
LICENSE = "Apache-2.0"

PV = "2026.02.0"

RPM_NAME = "python314-xarray-complete-2026.02.0-3.1.noarch.rpm"
RPM_HASH = "263eec4683883cf0690f18244d93eaced8e3957b3ab4e33c5faaf160e023583b544e98db2028129057e063ab2db61ff645b7eecfafa9e5fd2eed887026c9e87d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-xarray-complete"

RDEPENDS:${PN} += "python314-xarray \
python314-xarray-accel \
python314-xarray-io \
python314-xarray-parallel \
python314-xarray-viz"

inherit rpm
