SUMMARY = "Interactive plots and applications in the browser from Python"
DESCRIPTION = "Bokeh is an interactive visualization library for modern web browsers. \
It provides elegant, concise construction of versatile graphics and affords \
high-performance interactivity across large or streaming datasets. \
Bokeh can help anyone who wants to create interactive plots, dashboards, \
and data applications quickly and easily."
LICENSE = "BSD-3-Clause"

PV = "3.9.1"

RPM_NAME = "python314-bokeh-3.9.1-1.2.noarch.rpm"
RPM_HASH = "b6b69dd55ee5c640863e845a4c9614d9ea2a04ddfdc9ebffcce8a120c5685e552a547d1f6a2fb33aa8d822fd1bd0cc1dfd0ab593ed14fa3673af15a92a927504"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-bokeh \
python314-bokeh \
python3dist-bokeh"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-Jinja2 \
python314-Pillow \
python314-PyYAML \
python314-contourpy \
python314-narwhals \
python314-numpy \
python314-packaging \
python314-pandas \
python314-tornado \
python314-xyzservices \
update-alternatives"

inherit rpm
