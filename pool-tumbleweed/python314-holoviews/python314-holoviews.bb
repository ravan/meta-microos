SUMMARY = "Composable, declarative visualizations for Python"
DESCRIPTION = "HoloViews is a Python library for automated plotting of annotated \
data. \
 \
Instead of building a plot using direct calls to a plotting library, \
the developer instead first describes the data with semantic \
information and then additional metadata to determine more detailed \
aspects of the visualization. This approach provides automatic \
visualization that can be requested at any time as the data evolves, \
rendered automatically by one of the supported plotting libraries \
(such as Bokeh or Matplotlib)."
LICENSE = "BSD-3-Clause"

PV = "1.23.1"

RPM_NAME = "python314-holoviews-1.23.1-1.1.noarch.rpm"
RPM_HASH = "bb03e5591a6b96a1091d6e9da6414c783b390a54776487b50cc9a5843c0e079abb0d3e0be1fed2534fee8aae1f95bc5e1e6564040c186a8eb7b61a4ec3fbf85f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-holoviews \
python314-holoviews \
python3dist-holoviews"

RDEPENDS:${PN} += "-python314-param >= 2.0 with python314-param < 3 \
/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-bokeh \
python314-colorcet \
python314-narwhals \
python314-numpy \
python314-pandas \
python314-panel \
python314-python-dateutil \
python314-pyviz-comms \
update-alternatives"

inherit rpm
