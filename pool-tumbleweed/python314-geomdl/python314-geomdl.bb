SUMMARY = "Object-oriented B-Spline and NURBS evaluation library"
DESCRIPTION = "NURBS-Python (geomdl) is a pure Python, self-contained, object-oriented \
B-Spline and NURBS spline library."
LICENSE = "MIT"

PV = "5.3.1"

RPM_NAME = "python314-geomdl-5.3.1-4.5.noarch.rpm"
RPM_HASH = "63a3303a575f740b19e4f59cb2eeba8fc2a9464d8f5f4aea9c190e62e7f78e87e6d61596aa6135e183b2dadc55a71e5b64a88bc5a7b952ac3a36f172c1ba56a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-geomdl \
python314-geomdl \
python3dist-geomdl"

RDEPENDS:${PN} += "python-abi \
python314-matplotlib \
python314-numpy \
python314-plotly"

inherit rpm
