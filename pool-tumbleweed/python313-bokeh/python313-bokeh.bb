SUMMARY = "Interactive plots and applications in the browser from Python"
DESCRIPTION = "Bokeh is an interactive visualization library for modern web browsers. \
It provides elegant, concise construction of versatile graphics and affords \
high-performance interactivity across large or streaming datasets. \
Bokeh can help anyone who wants to create interactive plots, dashboards, \
and data applications quickly and easily."
LICENSE = "BSD-3-Clause"

PV = "3.9.1"

RPM_NAME = "python313-bokeh-3.9.1-1.2.noarch.rpm"
RPM_HASH = "42bb38e92dc8e29397a6525a515c83c5725283c717f9185bc13c8d97e40ca440ecef9644de7d0e12c78748c39742d291a0183c9111bd83eadf28228227155628"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bokeh \
python3.13dist-bokeh \
python313-bokeh \
python3dist-bokeh"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-Jinja2 \
python313-Pillow \
python313-PyYAML \
python313-contourpy \
python313-narwhals \
python313-numpy \
python313-packaging \
python313-pandas \
python313-tornado \
python313-xyzservices \
update-alternatives"

inherit rpm
