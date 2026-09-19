SUMMARY = "NS1 Authenticator plugin for Certbot"
DESCRIPTION = "Nsone DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "5.8.0"

RPM_NAME = "python314-certbot-dns-nsone-5.8.0-1.1.noarch.rpm"
RPM_HASH = "d7061398d0329494117dc299998308f2069dcff218885d42844abf578c3bb781cac33008bbc4961a8eecddb7c1bceb8a6b2d7d4919c93f5aefd6e3f4d5069ce4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-certbot-dns-nsone \
python314-certbot-dns-nsone \
python3dist-certbot-dns-nsone"

RDEPENDS:${PN} += "python-abi \
python314-acme \
python314-certbot \
python314-dns-lexicon"

inherit rpm
