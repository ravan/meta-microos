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

RPM_NAME = "python314-xarray-2026.02.0-3.1.noarch.rpm"
RPM_HASH = "61f61b8922a017420f306b73b8e1859e2565834d141c524d4fcaddd87eb0d6b321871f1ee658e4088552121fbd4b2bebffcb4896c3007b7dbc632acf4db56891"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-xarray \
python314-xarray \
python3dist-xarray"

RDEPENDS:${PN} += "python-abi \
python314-numpy \
python314-packaging \
python314-pandas"

inherit rpm
