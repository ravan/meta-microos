SUMMARY = "DNS Made Easy Authenticator plugin for Certbot"
DESCRIPTION = "Dns Made Easy DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "5.8.0"

RPM_NAME = "python313-certbot-dns-dnsmadeeasy-5.8.0-1.1.noarch.rpm"
RPM_HASH = "504a06a8b6c2f37d2052e25db4f1d7467c41ebc8454b9c5c4e0e2a31b06adbcaac7e579c959b7731711112f8a7f29f047c591f87c18b98357a0cbe65687e91d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-certbot-dns-dnsmadeeasy \
python3.13dist-certbot-dns-dnsmadeeasy \
python313-certbot-dns-dnsmadeeasy \
python3dist-certbot-dns-dnsmadeeasy"

RDEPENDS:${PN} += "python-abi \
python313-acme \
python313-certbot \
python313-dns-lexicon"

inherit rpm
