SUMMARY = "ACME client"
DESCRIPTION = "certbot is a free, automated certificate authority that aims \
to lower the barriers to entry for encrypting all HTTP traffic on the internet."
LICENSE = "Apache-2.0"

PV = "5.8.0"

RPM_NAME = "python313-certbot-5.8.0-1.1.noarch.rpm"
RPM_HASH = "b64a52d92fd82ec5e7cf71962208962ffd752733aac7b56897485cbf4a64ddcb34ea263d7e695467fa3ecdbaeb4a9a7fca1835355fa6c49ef61e261f98321ed2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "certbot \
python3-certbot \
python3.13dist-certbot \
python313-certbot \
python3dist-certbot"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-acme \
python313-configargparse \
python313-configobj \
python313-cryptography \
python313-distro \
python313-josepy \
python313-parsedatetime \
python313-pyRFC3339"

inherit rpm
