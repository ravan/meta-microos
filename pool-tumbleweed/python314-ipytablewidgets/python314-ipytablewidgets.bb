SUMMARY = "Widgets to help facilitate reuse of large tables across widgets"
DESCRIPTION = "Traitlets and widgets to efficiently data tables (e.g. Pandas DataFrame) using the jupyter notebook \
 \
ipytablewidgets is a set of widgets and traitlets to reuse of large tables such as Pandas DataFrames \
across different widgets, and different packages. \
 \
The major parts of ipytablewidgets are: \
 \
- Traits/Widgets definitions \
- Adapters to convert tables to those traits \
- Serializers/deserializers to send the data across the network \
- Apropriate javascript handling and representation of the data"
LICENSE = "BSD-3-Clause"

PV = "0.3.4"

RPM_NAME = "python314-ipytablewidgets-0.3.4-1.1.noarch.rpm"
RPM_HASH = "5d0c9193ea20a9a12d007d0ed7936ab07b68ca24359bc2db33e745fb46ac71d21dd16deaae4bf7cf41e6732b5828548ed68872ddd9aeac2491f16ea6f83aa97c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ipytablewidgets \
python314-ipytablewidgets \
python3dist-ipytablewidgets"

RDEPENDS:${PN} += "python-abi \
python314-ipywidgets \
python314-lz4 \
python314-numpy \
python314-pandas \
python314-traitlets"

inherit rpm
