SUMMARY = "Jupyter integration for python-plotly"
DESCRIPTION = "An interactive, open-source, and browser-based graphing library for Python. \
 \
Built on top of plotly.js, plotly.py is a high-level, declarative charting library. \
plotly.js ships with over 30 chart types, including scientific charts, \
3D graphs, statistical charts, SVG maps, financial charts, and more. \
 \
Plotly graphs can be viewed in Jupyter notebooks, other Python notebook \
software such as marimo, as standalone HTML files, or integrated into Dash applications. \
 \
This package provides the flavorless configuration for the \
Jupyterlab integration and widgets."
LICENSE = "MIT"

PV = "6.7.0"

RPM_NAME = "jupyter-plotly-6.7.0-2.2.noarch.rpm"
RPM_HASH = "9daf994aa6cfc92cf931ab8d0338215c21404c8cf27d60c68933a17f391ba8b79b490e37c16153dc97a933433c3ea729f3938c503511abdd50464b2850ce69f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-plotly \
jupyterlab-plotly"

RDEPENDS:${PN} += "python3dist-plotly"

inherit rpm
