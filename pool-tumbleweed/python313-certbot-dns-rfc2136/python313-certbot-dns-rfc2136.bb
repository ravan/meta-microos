SUMMARY = "RFC 2136 DNS Authenticator plugin for Certbot"
DESCRIPTION = "RFC 2136 DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "5.8.0"

RPM_NAME = "python313-certbot-dns-rfc2136-5.8.0-1.1.noarch.rpm"
RPM_HASH = "d3c852f86910f08b7f7e31a2ced8ae39fc0426440b024cac2cb988e0f0fe753471c6d7c2197ea24c98efd4a358f0ec161ae11643d2f0c060d795040f3ea9767a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-certbot-dns-rfc2136 \
python3.13dist-certbot-dns-rfc2136 \
python313-certbot-dns-rfc2136 \
python3dist-certbot-dns-rfc2136"

RDEPENDS:${PN} += "python-abi \
python313-acme \
python313-certbot \
python313-dnspython"

inherit rpm
