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

RPM_NAME = "python312-plotly-5.22.0-3.2.noarch.rpm"
RPM_HASH = "d4139399783e229273082f4999a9edf49ff9fc948b77885c8114c7c05c5794d2233a8a9469b5374063a83116eb291aae054aa1f476122d82222bbba51d15224a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.12dist-plotly \
python312-plotly \
python3dist-plotly"

RDEPENDS:${PN} += "python-abi \
python312-packaging \
python312-tenacity"

inherit rpm
