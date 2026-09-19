SUMMARY = "Interactive visualization package for statistical data for Python"
DESCRIPTION = "This package provides interactive data visualization tools in the Jupyter \
Notebook. \
 \
The interactive visualization tool that is provided allows data selection \
through HTML widgets and outputs a Vega-lite plot through Altair. In the HTML \
widget it is possible to select columns to plot in various encodings. This \
widget also supports some basic configuration (i.e., log vs linear scales)."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "python314-altair-widgets-0.2.2-5.6.noarch.rpm"
RPM_HASH = "32ddf331ff2149a5fc55268c04a755970380889e67e52a680cf319217dc5c629b02c6c28f309302acf330619707ecea382fc6cbfea740fa8f01ed0b15b0f6c70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-altair-widgets \
python314-altair-widgets \
python314-jupyter-altair-widgets \
python3dist-altair-widgets"

RDEPENDS:${PN} += "python-abi \
python314-altair \
python314-ipython \
python314-ipywidgets \
python314-pandas \
python314-vega"

inherit rpm
