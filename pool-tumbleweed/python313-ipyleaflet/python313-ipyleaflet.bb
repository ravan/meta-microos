SUMMARY = "A Jupyter widget for dynamic Leaflet maps"
DESCRIPTION = "A Jupyter / Leaflet bridge enabling interactive maps in the Jupyter notebook."
LICENSE = "MIT"

PV = "0.20.0"

RPM_NAME = "python313-ipyleaflet-0.20.0-2.4.noarch.rpm"
RPM_HASH = "5e8b537d27f28bc149702b9a48b004454a0865306bf19c37ba6a04ca1f6058b895e5d0c381a5759b208f4f60bded33777ba118c8e5979e7e26ed043c13dfdffe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipyleaflet \
python3.13dist-ipyleaflet \
python313-ipyleaflet \
python3dist-ipyleaflet"

RDEPENDS:${PN} += "-python313-ipywidgets >= 7.6.0 with python313-ipywidgets < 9 \
-python313-jupyter-leaflet >= 0.20 with python313-jupyter-leaflet < 0.21 \
-python313-traittypes >= 0.2.1 with python313-traittypes < 3 \
python-abi \
python313-branca \
python313-xyzservices"

inherit rpm
