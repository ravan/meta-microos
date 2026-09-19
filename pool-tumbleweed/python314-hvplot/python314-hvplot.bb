SUMMARY = "High-level plotting API for the PyData ecosystem built on HoloViews"
DESCRIPTION = "hvPlot provides a high-level plotting API built on HoloViews that \
provides a general and consistent API for plotting data in various \
formats from the PyData ecosystem. hvPlot can integrate neatly with \
individual PyData libraries if an extension mechanism for the native \
plot APIs is offered, or it can be used as a standalone component."
LICENSE = "BSD-3-Clause"

PV = "0.12.2"

RPM_NAME = "python314-hvplot-0.12.2-2.3.noarch.rpm"
RPM_HASH = "44efabefca40f87c136d953993c05f8abd0784565f27aa8ea5292cd79f18759de81a4723f81b2ef7178cb3518ea9697b0fdc8213e2114189b055955c76c94ccf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-hvplot \
python314-hvplot \
python3dist-hvplot"

RDEPENDS:${PN} += "-python314-param >= 1.12 with python314-param < 3 \
python-abi \
python314-bokeh \
python314-colorcet \
python314-holoviews \
python314-numpy \
python314-packaging \
python314-pandas \
python314-panel \
update-alternatives"

inherit rpm
