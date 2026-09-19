SUMMARY = "Object-oriented B-Spline and NURBS evaluation library"
DESCRIPTION = "NURBS-Python (geomdl) is a pure Python, self-contained, object-oriented \
B-Spline and NURBS spline library."
LICENSE = "MIT"

PV = "5.3.1"

RPM_NAME = "python311-geomdl-5.3.1-3.2.noarch.rpm"
RPM_HASH = "c7a12d3fa4bd82dbee68b753a4acdbb51ab4867eed7876e9366727323042f56dc459e6af5292da75335d4511420248249ac82b7d01a61792ba29d75c689818c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-geomdl \
python3.11dist-geomdl \
python311-geomdl \
python3dist-geomdl"

RDEPENDS:${PN} += "python-abi \
python311-matplotlib \
python311-numpy \
python311-plotly"

inherit rpm
