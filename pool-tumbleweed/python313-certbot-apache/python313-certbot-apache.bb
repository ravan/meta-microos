SUMMARY = "Apache plugin for Certbot"
DESCRIPTION = "The Apache plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "5.8.0"

RPM_NAME = "python313-certbot-apache-5.8.0-1.1.noarch.rpm"
RPM_HASH = "8fd61f37700305af2c295b681f9183ecec844415f18f875fcfae71d5cf1c537460d9a8855bd19269fb6ccc5015bc1a3bf6670ae6a8a9607bf9e1f444977e9f13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-certbot-apache \
python3.13dist-certbot-apache \
python313-certbot-apache \
python3dist-certbot-apache"

RDEPENDS:${PN} += "apache2 \
python-abi \
python313-acme \
python313-augeas \
python313-certbot"

inherit rpm
