SUMMARY = "Route53 DNS Authenticator plugin for Certbot"
DESCRIPTION = "This certbot plugin automates the process of completing an ACME \
dns-01 challenge by creating, and subsequently removing, TXT \
records using AWS Route53."
LICENSE = "Apache-2.0"

PV = "5.8.0"

RPM_NAME = "python314-certbot-dns-route53-5.8.0-1.1.noarch.rpm"
RPM_HASH = "4963b03eb43b2fe08e5a021dbd00f0f1e16fec6e46c54b15068bb8e8f1840a103b10eaf97e19f0b1fa5912e07bd07af32cdb58baae21aaf9cee9d9dce167c134"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-certbot-dns-route53 \
python314-certbot-dns-route53 \
python3dist-certbot-dns-route53"

RDEPENDS:${PN} += "python-abi \
python314-acme \
python314-boto3 \
python314-certbot"

inherit rpm
