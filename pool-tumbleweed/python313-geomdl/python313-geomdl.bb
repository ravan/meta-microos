SUMMARY = "Object-oriented B-Spline and NURBS evaluation library"
DESCRIPTION = "NURBS-Python (geomdl) is a pure Python, self-contained, object-oriented \
B-Spline and NURBS spline library."
LICENSE = "MIT"

PV = "5.3.1"

RPM_NAME = "python313-geomdl-5.3.1-4.5.noarch.rpm"
RPM_HASH = "f89fb88725fa0045e280cbac6a59de61efbf2fc250bce6c409315da447ef62f1855b0044a35d2b1531e7991b66060a3bf587ac8078110fee953dabb16ce79a51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-geomdl \
python3.13dist-geomdl \
python313-geomdl \
python3dist-geomdl"

RDEPENDS:${PN} += "python-abi \
python313-matplotlib \
python313-numpy \
python313-plotly"

inherit rpm
