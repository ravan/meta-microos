SUMMARY = "Route53 DNS Authenticator plugin for Certbot"
DESCRIPTION = "This certbot plugin automates the process of completing an ACME \
dns-01 challenge by creating, and subsequently removing, TXT \
records using AWS Route53."
LICENSE = "Apache-2.0"

PV = "5.8.0"

RPM_NAME = "python313-certbot-dns-route53-5.8.0-1.1.noarch.rpm"
RPM_HASH = "501dd4924965241d175e6b774fdee775eef67f0a9af894a2f107ae0849677c262defad483a06659f75b62b506c0519595011cf7ef5d6396c4f118e92718373ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-certbot-dns-route53 \
python3.13dist-certbot-dns-route53 \
python313-certbot-dns-route53 \
python3dist-certbot-dns-route53"

RDEPENDS:${PN} += "python-abi \
python313-acme \
python313-boto3 \
python313-certbot"

inherit rpm
