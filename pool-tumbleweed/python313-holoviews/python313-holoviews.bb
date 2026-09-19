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

RPM_NAME = "python313-holoviews-1.23.1-1.1.noarch.rpm"
RPM_HASH = "8cc006b9ed72234b525fa9d17e68a14b35cc8a422dfc3c60c2624a985e7d2596f0577377973cbc9658624db9702830cf7a5bad7b2af840cbed1b0302136288d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-holoviews \
python3.13dist-holoviews \
python313-holoviews \
python3dist-holoviews"

RDEPENDS:${PN} += "-python313-param >= 2.0 with python313-param < 3 \
/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-bokeh \
python313-colorcet \
python313-narwhals \
python313-numpy \
python313-pandas \
python313-panel \
python313-python-dateutil \
python313-pyviz-comms \
update-alternatives"

inherit rpm
