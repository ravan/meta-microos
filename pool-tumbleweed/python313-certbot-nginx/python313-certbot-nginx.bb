SUMMARY = "Nginx plugin for Certbot"
DESCRIPTION = "The Nginx plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "5.8.0"

RPM_NAME = "python313-certbot-nginx-5.8.0-1.1.noarch.rpm"
RPM_HASH = "8f0f8e86d38f1ef14309816d7b690759b826b1ee6ff87b55951bd8aa58d3fa4627aa5d19621b682fbd8906b4fc5ac14574ad74d285943478ce56d76a40c4768a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-certbot-nginx \
python3.13dist-certbot-nginx \
python313-certbot-nginx \
python3dist-certbot-nginx"

RDEPENDS:${PN} += "nginx \
python-abi \
python313-acme \
python313-certbot \
python313-pyOpenSSL \
python313-pyparsing"

inherit rpm
