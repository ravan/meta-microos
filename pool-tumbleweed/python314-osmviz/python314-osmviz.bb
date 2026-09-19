SUMMARY = "An OpenStreetMap Visualization Toolkit for Python"
DESCRIPTION = "OSMViz is a small set of Python tools for retrieving and using Mapnik \
tiles from a Slippy Map server (you may know these as OpenStreetMap \
images)."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python314-osmviz-1.1.0-4.5.noarch.rpm"
RPM_HASH = "4802707390bee6ea0edc553d760957b82e736d353b1f9b0d135ac225b7284944fae34f41ffa18fe2a4d01f3b97168a24b15730e2ab7d1a9092eeda81f785a65b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-osmviz \
python314-osmviz \
python3dist-osmviz"

RDEPENDS:${PN} += "python-abi \
python314-pygame"

inherit rpm
