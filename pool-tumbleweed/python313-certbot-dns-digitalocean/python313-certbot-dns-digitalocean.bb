SUMMARY = "DigitalOcean Authenticator plugin for Certbot"
DESCRIPTION = "Digitalocean DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "5.8.0"

RPM_NAME = "python313-certbot-dns-digitalocean-5.8.0-1.1.noarch.rpm"
RPM_HASH = "f7a8fa3a4cdedf31d16fe2f1a9f9feacb130264e39b1e92724e5d7236de5234bd1d565d11b85cf54a63242615cf3a7ede07073db3a32e2b5c5dbb2f54cda2bdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-certbot-dns-digitalocean \
python3.13dist-certbot-dns-digitalocean \
python313-certbot-dns-digitalocean \
python3dist-certbot-dns-digitalocean"

RDEPENDS:${PN} += "python-abi \
python313-acme \
python313-certbot \
python313-digitalocean"

inherit rpm
