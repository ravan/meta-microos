SUMMARY = "DNSimple Authenticator plugin for Certbot"
DESCRIPTION = "DNSimple DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "5.8.0"

RPM_NAME = "python314-certbot-dns-dnsimple-5.8.0-1.1.noarch.rpm"
RPM_HASH = "411d96650b7c9809d9fe3964b7731347770e9b81835513aeedbb20360f986f7c1a9e5a4bd6cf4bb3ad51958d3f223924346eab822f6965b043677f5e4f8b1263"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-certbot-dns-dnsimple \
python314-certbot-dns-dnsimple \
python3dist-certbot-dns-dnsimple"

RDEPENDS:${PN} += "python-abi \
python314-acme \
python314-certbot \
python314-dns-lexicon"

inherit rpm
