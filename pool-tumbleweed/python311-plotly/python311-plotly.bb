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

RPM_NAME = "python311-plotly-5.22.0-3.2.noarch.rpm"
RPM_HASH = "7c5283aa60914c1777ad7534d2d45388f1554f7797239cb95adf9ca41c4c09092c928787da972fdb81aafd26d20632f0a6f11eb99ec7d99f63a65a0543e5a4dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-plotly \
python3.11dist-plotly \
python311-plotly \
python3dist-plotly"

RDEPENDS:${PN} += "python-abi \
python311-packaging \
python311-tenacity"

inherit rpm
