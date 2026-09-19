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

RPM_NAME = "python313-ipytablewidgets-0.3.4-1.1.noarch.rpm"
RPM_HASH = "f215969ceb057dc22c8bee761a9813f57acd7b01fa4d5a73663127c233ca7aa7df8d403bde6d9cac716f303490147330d98da89d998d3149dbae22d1115f81ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipytablewidgets \
python3.13dist-ipytablewidgets \
python313-ipytablewidgets \
python3dist-ipytablewidgets"

RDEPENDS:${PN} += "python-abi \
python313-ipywidgets \
python313-lz4 \
python313-numpy \
python313-pandas \
python313-traitlets"

inherit rpm
