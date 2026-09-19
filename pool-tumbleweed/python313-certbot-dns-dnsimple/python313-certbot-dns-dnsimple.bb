SUMMARY = "DNSimple Authenticator plugin for Certbot"
DESCRIPTION = "DNSimple DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "5.8.0"

RPM_NAME = "python313-certbot-dns-dnsimple-5.8.0-1.1.noarch.rpm"
RPM_HASH = "3ec078614a94b8d338b4c9fa14790a279d6d54e31d325515a77173b1b836231b552aabfd13d5b134c751e9b79e4403f608bcbf78c1ec6595b3313f9e344aafc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-certbot-dns-dnsimple \
python3.13dist-certbot-dns-dnsimple \
python313-certbot-dns-dnsimple \
python3dist-certbot-dns-dnsimple"

RDEPENDS:${PN} += "python-abi \
python313-acme \
python313-certbot \
python313-dns-lexicon"

inherit rpm
