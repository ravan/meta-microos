SUMMARY = "DigitalOcean Authenticator plugin for Certbot"
DESCRIPTION = "Digitalocean DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "5.8.0"

RPM_NAME = "python314-certbot-dns-digitalocean-5.8.0-1.1.noarch.rpm"
RPM_HASH = "8c8176d1f9d97ef362ab9afeff3b22b079cbb1764b7333c1522cefc30be3c39d2139730f44b5e7fbec29ef9806b0daa9bcdc7c2e379b6bcde1c9c4b18b7e9850"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-certbot-dns-digitalocean \
python314-certbot-dns-digitalocean \
python3dist-certbot-dns-digitalocean"

RDEPENDS:${PN} += "python-abi \
python314-acme \
python314-certbot \
python314-digitalocean"

inherit rpm
