SUMMARY = "Object-oriented B-Spline and NURBS evaluation library"
DESCRIPTION = "NURBS-Python (geomdl) is a pure Python, self-contained, object-oriented \
B-Spline and NURBS spline library."
LICENSE = "MIT"

PV = "5.3.1"

RPM_NAME = "python310-geomdl-5.3.1-3.2.noarch.rpm"
RPM_HASH = "b4fcd6d924886126dfba28d50385822b6719851de9eba2676024dc3c18c6de5fd26a9b262b3ece3f6a83f5a27e532be884e51767e0acae9d4266c3ffbd146210"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-geomdl \
python310-geomdl \
python3dist-geomdl"

RDEPENDS:${PN} += "python-abi \
python310-matplotlib \
python310-numpy \
python310-plotly"

inherit rpm
