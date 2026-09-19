SUMMARY = "Apache Integration for dehydrated"
DESCRIPTION = "This adds a configuration file for dehydrated's acme-challenge to Apache."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "dehydrated-apache2-0.7.1-3.8.noarch.rpm"
RPM_HASH = "f28dd397b295f640382d69fc5e0d0330adfed8ac2cba60d560acd00cdd35c6e1a5f1160d6ea2c1b9bf4ea03e7b02ad46a334fe96191f73bb329e415324a73ce9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-dehydrated-apache2 \
dehydrated-apache2 \
letsencrypt.sh-apache2"

RDEPENDS:${PN} += "apache2 \
dehydrated"

inherit rpm
