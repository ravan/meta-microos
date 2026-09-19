SUMMARY = "Cloudflare Authenticator plugin for Certbot"
DESCRIPTION = "Cloudflare DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "5.8.0"

RPM_NAME = "python313-certbot-dns-cloudflare-5.8.0-1.1.noarch.rpm"
RPM_HASH = "ce28ade1aa9783ce52e8068ddfa5868f91b436a8a09d71a6e001049a3d644ba79d52a1f83b21bf25203459884e60a3e53d7b33a5a117a3cb2e0b383201acd2a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-certbot-dns-cloudflare \
python3.13dist-certbot-dns-cloudflare \
python313-certbot-dns-cloudflare \
python3dist-certbot-dns-cloudflare"

RDEPENDS:${PN} += "python-abi \
python313-acme \
python313-certbot \
python313-cloudflare"

inherit rpm
