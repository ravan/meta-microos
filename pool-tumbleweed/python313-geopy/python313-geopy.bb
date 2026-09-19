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

RPM_NAME = "python313-geopy-2.5.0-1.1.noarch.rpm"
RPM_HASH = "0c779d3531bc6d7d0b788229ae8f8f99056fb3722e620a1f8850957c5632c5846ecea4580964cf25383d5dd2e4770d87f98581e962c1cb12001af2722502761e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-geopy \
python3.13dist-geopy \
python313-geopy \
python3dist-geopy"

RDEPENDS:${PN} += "python-abi \
python313-geographiclib"

inherit rpm
