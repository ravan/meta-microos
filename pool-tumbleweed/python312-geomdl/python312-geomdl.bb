SUMMARY = "Object-oriented B-Spline and NURBS evaluation library"
DESCRIPTION = "NURBS-Python (geomdl) is a pure Python, self-contained, object-oriented \
B-Spline and NURBS spline library."
LICENSE = "MIT"

PV = "5.3.1"

RPM_NAME = "python312-geomdl-5.3.1-3.2.noarch.rpm"
RPM_HASH = "6da73cf2aafd08f962ab18d8af13467d2cf133993744d048c7f40e88f5107dd0a2ed43493eba4fe7eb1c4657b3d9f201456d150dadf80423ad2275726bd725a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.12dist-geomdl \
python312-geomdl \
python3dist-geomdl"

RDEPENDS:${PN} += "python-abi \
python312-matplotlib \
python312-numpy \
python312-plotly"

inherit rpm
