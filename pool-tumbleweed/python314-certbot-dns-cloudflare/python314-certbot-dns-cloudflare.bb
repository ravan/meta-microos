SUMMARY = "Cloudflare Authenticator plugin for Certbot"
DESCRIPTION = "Cloudflare DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "5.8.0"

RPM_NAME = "python314-certbot-dns-cloudflare-5.8.0-1.1.noarch.rpm"
RPM_HASH = "3ef081b1c7a3eeb4f40bee144100e7bbbd8f939e3b7844c9d5fff4944d35cfd1ce48c46476c06a2ef9ee4444c9fc1fdf37a4efaa974c6c312628b452741155da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-certbot-dns-cloudflare \
python314-certbot-dns-cloudflare \
python3dist-certbot-dns-cloudflare"

RDEPENDS:${PN} += "python-abi \
python314-acme \
python314-certbot \
python314-cloudflare"

inherit rpm
