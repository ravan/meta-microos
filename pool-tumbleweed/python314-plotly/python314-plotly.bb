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

RPM_NAME = "python314-plotly-6.7.0-2.2.noarch.rpm"
RPM_HASH = "ce0918723f1fe89056db169fd560707653188b50a19687bd49737550b50c1c75160480889bc467af63a6dab98153f3275b808035e0e421fba0740f4d09dcb632"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-plotly \
python314-plotly \
python3dist-plotly"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
alts \
python-abi \
python314-narwhals \
python314-packaging"

inherit rpm
