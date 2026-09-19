SUMMARY = "Linode DNS Authenticator plugin for Certbot"
DESCRIPTION = "This certbot plugin automates the process of completing an ACME \
dns-01 challenge by creating, and subsequently removing, TXT \
records using Linode's DNS API."
LICENSE = "Apache-2.0"

PV = "5.8.0"

RPM_NAME = "python313-certbot-dns-linode-5.8.0-1.1.noarch.rpm"
RPM_HASH = "efdf1355edb42552f4baf2a96bb5839bd465346f2ad65e2c2d0ce2ad4c9cf93d680ab8fa39dcd51fcd547943c61b7a75407ce55e94dc391fee6f129b8a3585f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-certbot-dns-linode \
python3.13dist-certbot-dns-linode \
python313-certbot-dns-linode \
python3dist-certbot-dns-linode"

RDEPENDS:${PN} += "python-abi \
python313-acme \
python313-certbot \
python313-dns-lexicon"

inherit rpm
