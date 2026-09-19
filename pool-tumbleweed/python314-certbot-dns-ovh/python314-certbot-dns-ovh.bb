SUMMARY = "OVH DNS Authenticator plugin for Certbot"
DESCRIPTION = "OVH DNS Authenticator plugin for Certbot"
LICENSE = "Apache-2.0"

PV = "5.8.0"

RPM_NAME = "python314-certbot-dns-ovh-5.8.0-1.1.noarch.rpm"
RPM_HASH = "a012713cea5c8b908313dede2499e2fb5e62f07c17ade08b9f48dba7d11d47d90717cce12f6c01220d4b4dfbf2042627e6fa02df84fac5319c6b765ba3f3910d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-certbot-dns-ovh \
python314-certbot-dns-ovh \
python3dist-certbot-dns-ovh"

RDEPENDS:${PN} += "python-abi \
python314-acme \
python314-certbot \
python314-dns-lexicon"

inherit rpm
