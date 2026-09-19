SUMMARY = "Geolocation database files for xt_geoip"
DESCRIPTION = "The package contains the GeoIP definition files (which IP addresses \
belong to which country) that are needed for Xtables-addons's \
xt_geoip module. \
 \
This product includes Country Lite data created by DBIP, available from \
https://db-ip.com/db/lite.php . \
Please do not contact them for errors with this package."
LICENSE = "CC-BY-4.0"

PV = "20201001"

RPM_NAME = "xtables-geoip-20201001-1.16.noarch.rpm"
RPM_HASH = "31fa9e8c50d02c652ed4ef61d9f4a500132d740cf04b773aa7872fea5d843cd5999fea492daa387d1b9ade28ce5cd5eb56cc995408116b690f68b904fdc13f36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xtables-geoip"

RDEPENDS:${PN} += ""

inherit rpm
