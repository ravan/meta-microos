SUMMARY = "Library for collaborative, interactive, publication-quality graphs"
DESCRIPTION = "Use this package to make collaborative, interactive, \
publication-quality graphs from Python on https://plot.ly. \
 \
Plotly is an online collaborative data analysis and graphing tool. The \
Python API allows you to access all of Plotly's functionality from Python. \
Plotly figures are shared, tracked, and edited all online and the data is \
always accessible from the graph."
LICENSE = "MIT"

PV = "5.22.0"

RPM_NAME = "python310-plotly-5.22.0-3.2.noarch.rpm"
RPM_HASH = "91e587dce259e947c71d5737a11f16b0dca8cded5da804c5a6dc64843f6b4a57f5478fcba2a087745923c33c97a0a675e414ae28beef159caabc494a228242e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-plotly \
python310-plotly \
python3dist-plotly"

RDEPENDS:${PN} += "python-abi \
python310-packaging \
python310-tenacity"

inherit rpm
