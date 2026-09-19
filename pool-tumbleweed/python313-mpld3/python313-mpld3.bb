SUMMARY = "D3 Viewer for Matplotlib"
DESCRIPTION = "This is an interactive D3js-based viewer which brings matplotlib graphics to the browser. \
Please visit http://mpld3.github.io for documentation and examples. \
 \
mpld3 provides a custom stand-alone javascript library built on D3, which \
parses JSON representations of plots.  The mpld3 python module provides a \
set of routines which parses matplotlib plots (using the mplexporter \
framework) and outputs the JSON description readable by mpld3.js."
LICENSE = "BSD-3-Clause"

PV = "0.5.12"

RPM_NAME = "python313-mpld3-0.5.12-1.4.noarch.rpm"
RPM_HASH = "65b3add7c18d2ccf5bfe6fd5435f29921041be7388febef7ba0c866e8bc00072bce037f9e44239ef5273696195ea094e531455d0bcff727e834c7bea1759b611"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mpld3 \
python3.13dist-mpld3 \
python313-mpld3 \
python3dist-mpld3"

RDEPENDS:${PN} += "python-abi \
python313-Jinja2 \
python313-matplotlib"

inherit rpm
