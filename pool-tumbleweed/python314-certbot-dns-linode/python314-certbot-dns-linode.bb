SUMMARY = "Linode DNS Authenticator plugin for Certbot"
DESCRIPTION = "This certbot plugin automates the process of completing an ACME \
dns-01 challenge by creating, and subsequently removing, TXT \
records using Linode's DNS API."
LICENSE = "Apache-2.0"

PV = "5.8.0"

RPM_NAME = "python314-certbot-dns-linode-5.8.0-1.1.noarch.rpm"
RPM_HASH = "ae9d3a5113acc952fe0e8bf9a8dcb5ac4caa1daf08b2707c3cf0ea3209267894e133738afc50f518c8a90a6087d8e874e2d0799616f1c48df9f102b49704c4a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-certbot-dns-linode \
python314-certbot-dns-linode \
python3dist-certbot-dns-linode"

RDEPENDS:${PN} += "python-abi \
python314-acme \
python314-certbot \
python314-dns-lexicon"

inherit rpm
