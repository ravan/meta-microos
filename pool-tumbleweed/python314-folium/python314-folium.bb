SUMMARY = "Make beautiful maps with Leafletjs and Python"
DESCRIPTION = "Folium is a python library to make beautiful maps with Leafletsjs. Folium \
builds on the data wrangling strengths of the Python ecosystem and the mapping \
strengths of the Leaflet.js library. Manipulate your data in Python, then \
visualize it in a Leaflet map via folium."
LICENSE = "MIT"

PV = "0.20.0"

RPM_NAME = "python314-folium-0.20.0-1.1.noarch.rpm"
RPM_HASH = "03d4abf9a7ec9c9a8f994ea55a480032d44497756d97adc32e1e1c7ca1a7de31c22381d8325d506afb2be0202567bcde60b5e431ebc751e45ff10b3067ea9e9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-folium \
python314-folium \
python3dist-folium"

RDEPENDS:${PN} += "python-abi \
python314-Jinja2 \
python314-branca \
python314-numpy \
python314-requests \
python314-xyzservices"

inherit rpm
