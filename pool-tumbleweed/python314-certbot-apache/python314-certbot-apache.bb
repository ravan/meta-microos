SUMMARY = "Apache plugin for Certbot"
DESCRIPTION = "The Apache plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "5.8.0"

RPM_NAME = "python314-certbot-apache-5.8.0-1.1.noarch.rpm"
RPM_HASH = "19d84a89c07e2f45946f16ea20f061adb6fc38888b55e44e99bc2976d1506f8a9af8695a3b279f514d1bcef0772e4b50b254586a32021adc927647f62c8554c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-certbot-apache \
python314-certbot-apache \
python3dist-certbot-apache"

RDEPENDS:${PN} += "apache2 \
python-abi \
python314-acme \
python314-augeas \
python314-certbot"

inherit rpm
