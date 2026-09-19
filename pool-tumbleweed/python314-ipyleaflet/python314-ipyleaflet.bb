SUMMARY = "A Jupyter widget for dynamic Leaflet maps"
DESCRIPTION = "A Jupyter / Leaflet bridge enabling interactive maps in the Jupyter notebook."
LICENSE = "MIT"

PV = "0.20.0"

RPM_NAME = "python314-ipyleaflet-0.20.0-2.4.noarch.rpm"
RPM_HASH = "8dfcc711e678a1b9449e8b0d9261e4c14ec0e80e2a5de931db99bd5329a365899a68685a397d67512fe309acadc0394d80c8982fda610872d89fa2a75d22d2dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ipyleaflet \
python314-ipyleaflet \
python3dist-ipyleaflet"

RDEPENDS:${PN} += "-python314-ipywidgets >= 7.6.0 with python314-ipywidgets < 9 \
-python314-jupyter-leaflet >= 0.20 with python314-jupyter-leaflet < 0.21 \
-python314-traittypes >= 0.2.1 with python314-traittypes < 3 \
python-abi \
python314-branca \
python314-xyzservices"

inherit rpm
