SUMMARY = "Make beautiful maps with Leafletjs and Python"
DESCRIPTION = "Folium is a python library to make beautiful maps with Leafletsjs. Folium \
builds on the data wrangling strengths of the Python ecosystem and the mapping \
strengths of the Leaflet.js library. Manipulate your data in Python, then \
visualize it in a Leaflet map via folium."
LICENSE = "MIT"

PV = "0.20.0"

RPM_NAME = "python313-folium-0.20.0-1.1.noarch.rpm"
RPM_HASH = "ef8adb2dfabe0630ae9ac0ae9df39a17b22932d8ac57c4eccf9323cc84cc35906ad106ab07b82cf5576034fce1059375de2613f35579bdf4badbf84f8333abc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-folium \
python3.13dist-folium \
python313-folium \
python3dist-folium"

RDEPENDS:${PN} += "python-abi \
python313-Jinja2 \
python313-branca \
python313-numpy \
python313-requests \
python313-xyzservices"

inherit rpm
