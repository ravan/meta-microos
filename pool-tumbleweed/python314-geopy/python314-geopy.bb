SUMMARY = "Python Geocoding Toolbox"
DESCRIPTION = "Geopy can determine the coordinates of addresses, cities, countries, \
and landmarks using third-party geocoders and other data sources such \
as wikis. \
 \
Geopy currently includes support for six geocoders: Google Maps, Yahoo! Maps, Windows \
Local Live (Virtual Earth), geocoder.us, GeoNames, MediaWiki pages (with the GIS \
extension), and Semantic MediaWiki pages."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "python314-geopy-2.5.0-1.1.noarch.rpm"
RPM_HASH = "3e910531360f27141381c6f3f9a8d253c91a60a2ff3cba51c17dca4ebde6f60dc6aef1e0249c6bb3ab3bfa25c215f65f40324d502eddf1cdbae2c0fbd582af3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-geopy \
python314-geopy \
python3dist-geopy"

RDEPENDS:${PN} += "python-abi \
python314-geographiclib"

inherit rpm
