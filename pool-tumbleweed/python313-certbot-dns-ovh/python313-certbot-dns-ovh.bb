SUMMARY = "OVH DNS Authenticator plugin for Certbot"
DESCRIPTION = "OVH DNS Authenticator plugin for Certbot"
LICENSE = "Apache-2.0"

PV = "5.8.0"

RPM_NAME = "python313-certbot-dns-ovh-5.8.0-1.1.noarch.rpm"
RPM_HASH = "a5b20fe667b4911fcebc2b2b4827d9af02b31edb095795194e0d53028196b62979ee97aa60e839526ee32183df286fc93d3a40d57d478123d82b99d85fa7927c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-certbot-dns-ovh \
python3.13dist-certbot-dns-ovh \
python313-certbot-dns-ovh \
python3dist-certbot-dns-ovh"

RDEPENDS:${PN} += "python-abi \
python313-acme \
python313-certbot \
python313-dns-lexicon"

inherit rpm
