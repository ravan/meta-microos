SUMMARY = "Interactive, browser-based graphing library for Python"
DESCRIPTION = "An interactive, open-source, and browser-based graphing library for Python. \
 \
Built on top of plotly.js, plotly.py is a high-level, declarative charting library. \
plotly.js ships with over 30 chart types, including scientific charts, \
3D graphs, statistical charts, SVG maps, financial charts, and more. \
 \
Plotly graphs can be viewed in Jupyter notebooks, other Python notebook \
software such as marimo, as standalone HTML files, or integrated into Dash applications."
LICENSE = "MIT"

PV = "6.7.0"

RPM_NAME = "python313-plotly-6.7.0-2.2.noarch.rpm"
RPM_HASH = "796fba48984cdbb2966792761f49de92dd5588f114165d706a5edbe30660fe91e6a327b9497a56920b2b4d9944544271e819c5ec724c53200aa21f55979100e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-plotly \
python3.13dist-plotly \
python313-plotly \
python3dist-plotly"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
alts \
python-abi \
python313-narwhals \
python313-packaging"

inherit rpm
