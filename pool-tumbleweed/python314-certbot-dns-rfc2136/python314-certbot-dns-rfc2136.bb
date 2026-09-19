SUMMARY = "RFC 2136 DNS Authenticator plugin for Certbot"
DESCRIPTION = "RFC 2136 DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "5.8.0"

RPM_NAME = "python314-certbot-dns-rfc2136-5.8.0-1.1.noarch.rpm"
RPM_HASH = "e1866e756b0f410aec8a16ba8b0029efc49d4fb18ac3bca808b6a7ba6e6e64bfcc2d49b2483b9a9e19edbca0b21941dda94f38fb8eaa80db25980e0620f8c1f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-certbot-dns-rfc2136 \
python314-certbot-dns-rfc2136 \
python3dist-certbot-dns-rfc2136"

RDEPENDS:${PN} += "python-abi \
python314-acme \
python314-certbot \
python314-dnspython"

inherit rpm
