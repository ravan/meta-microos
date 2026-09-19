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

RPM_NAME = "python314-mpld3-0.5.12-1.4.noarch.rpm"
RPM_HASH = "689f59fd0eff4c32d50c0736257e9495fdd258d4ddcb09319af6f4eadb2f14ec578fa0d172b26a1b1a0833cb44e0a4a06bffaa8c50183290688da1d8bab63d8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mpld3 \
python314-mpld3 \
python3dist-mpld3"

RDEPENDS:${PN} += "python-abi \
python314-Jinja2 \
python314-matplotlib"

inherit rpm
