SUMMARY = "Apache configuration for matomo"
DESCRIPTION = "This subpackage contains the Apache configuration files"
LICENSE = "GPL-3.0-or-later"

PV = "5.13.0"

RPM_NAME = "matomo-apache-5.13.0-1.1.noarch.rpm"
RPM_HASH = "cbc5634059bb92901d3090a1ba91481e923844e3decd9c9c9cd99b62e3301cfa0771a91f43ee795a427dec6b15d87f909ad8ed70cc80c0de7e97d85f64e767c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-matomo-apache \
matomo-apache"

RDEPENDS:${PN} += "apache2 \
mod-php-any"

inherit rpm
