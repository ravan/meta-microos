SUMMARY = "Proxy for geospatial data"
DESCRIPTION = "MapProxy is an open source proxy for geospatial data. It caches, \
accelerates and transforms data from existing map services and \
serves any desktop or web GIS client."
LICENSE = "Apache-2.0"

PV = "6.0.1"

RPM_NAME = "python3-MapProxy-6.0.1-1.2.noarch.rpm"
RPM_HASH = "3d47de4c505c8e56fdca232f32873d5f07b7d63f442dc1c6fe47c93137ba544ad4683e9cf9076d77ba19334f8ade3b6b78635ebe1c78ce1ffbadaf34dfa97771"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-MapProxy \
python3-mapproxy \
python3.13dist-mapproxy \
python3dist-mapproxy"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.13 \
/usr/bin/sh \
gdal \
geos \
proj \
python-abi \
python3-Babel \
python3-Pillow \
python3-PyYAML \
python3-Werkzeug \
python3-jinja2 \
python3-jsonschema \
python3-lxml \
python3-pyproj \
python3-python-dateutil \
python3-shapely \
update-alternatives"

inherit rpm
