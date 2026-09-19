SUMMARY = "Nginx plugin for Certbot"
DESCRIPTION = "The Nginx plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "5.8.0"

RPM_NAME = "python314-certbot-nginx-5.8.0-1.1.noarch.rpm"
RPM_HASH = "cb1a847c83a7ccb7c794ece4c40fe539c7d55e6dff334d1f4210181e413183177c0f25eaea35ef0fdfd901d3e8c8b491107af160239e3336ea5553ed0d2e1c60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-certbot-nginx \
python314-certbot-nginx \
python3dist-certbot-nginx"

RDEPENDS:${PN} += "nginx \
python-abi \
python314-acme \
python314-certbot \
python314-pyOpenSSL \
python314-pyparsing"

inherit rpm
