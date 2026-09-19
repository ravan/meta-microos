SUMMARY = "DNS Made Easy Authenticator plugin for Certbot"
DESCRIPTION = "Dns Made Easy DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "5.8.0"

RPM_NAME = "python314-certbot-dns-dnsmadeeasy-5.8.0-1.1.noarch.rpm"
RPM_HASH = "7665f5ef901fdf87e4c3086e83948f12b841ee30e502af7475cc96db93e7ad0b4427160843e848f05ede53e550cb2d2d9f8deb245a320913ec9cfea370b3d585"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-certbot-dns-dnsmadeeasy \
python314-certbot-dns-dnsmadeeasy \
python3dist-certbot-dns-dnsmadeeasy"

RDEPENDS:${PN} += "python-abi \
python314-acme \
python314-certbot \
python314-dns-lexicon"

inherit rpm
