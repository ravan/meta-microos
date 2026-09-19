SUMMARY = "N-D labeled arrays and datasets in Python"
DESCRIPTION = "xarray (formerly xray) is a python-pandas-like and pandas-compatible \
toolkit for analytics on multi-dimensional arrays. It provides \
N-dimensional variants of the python-pandas labeled data structures, \
rather than the tabular data that pandas uses. \
 \
The Common Data Model for self-describing scientific data is used. \
The dataset is an in-memory representation of a netCDF file."
LICENSE = "Apache-2.0"

PV = "2026.02.0"

RPM_NAME = "python313-xarray-2026.02.0-3.1.noarch.rpm"
RPM_HASH = "bcd5afbc1958a3c34a490c43be1513b8b66090ebd0f65f63c4d39c4ebc27ee232385a9bc4c24b2309bf6d6030c67815c6b806f9d14b0e31648e1a880af2d3865"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xarray \
python3.13dist-xarray \
python313-xarray \
python3dist-xarray"

RDEPENDS:${PN} += "python-abi \
python313-numpy \
python313-packaging \
python313-pandas"

inherit rpm
