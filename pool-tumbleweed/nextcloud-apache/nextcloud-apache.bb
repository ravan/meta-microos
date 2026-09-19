SUMMARY = "Apache configuration for nextcloud"
DESCRIPTION = "This subpackage contains the Apache configuration files"
LICENSE = "AGPL-3.0-only"

PV = "34.0.4"

RPM_NAME = "nextcloud-apache-34.0.4-1.1.noarch.rpm"
RPM_HASH = "9c89a9de3b0762aee638d803b2480a523b27ed6c4e87644065a7bddeba3b9e6cc3e73409dc765247cec2774518ddee237a39353581824d01912b69d0257ae138"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-nextcloud-apache \
nextcloud-apache"

RDEPENDS:${PN} += "apache2 \
mod-php-any \
nextcloud"

inherit rpm
