SUMMARY = "An OpenStreetMap Visualization Toolkit for Python"
DESCRIPTION = "OSMViz is a small set of Python tools for retrieving and using Mapnik \
tiles from a Slippy Map server (you may know these as OpenStreetMap \
images)."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python313-osmviz-1.1.0-4.5.noarch.rpm"
RPM_HASH = "8500274403d5dbb227c77d9ed9a1e43a6ad62c104b6998149cf99aa8ca30bde19de2057a079a94c0c6e65a5d7c319c1e2edbd78453e90489a41dd95a9968278a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-osmviz \
python3.13dist-osmviz \
python313-osmviz \
python3dist-osmviz"

RDEPENDS:${PN} += "python-abi \
python313-pygame"

inherit rpm
