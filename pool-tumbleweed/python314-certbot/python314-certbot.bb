SUMMARY = "ACME client"
DESCRIPTION = "certbot is a free, automated certificate authority that aims \
to lower the barriers to entry for encrypting all HTTP traffic on the internet."
LICENSE = "Apache-2.0"

PV = "5.8.0"

RPM_NAME = "python314-certbot-5.8.0-1.1.noarch.rpm"
RPM_HASH = "93f8941bcf7174ca1c3c445d96ef88d4e72e5ad5578bb44486345788f0ec03a267f071b5bbb700e2fb2952582da9f4f0ec73484d3133cbac2b7386d0e8d545f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "certbot \
python3.14dist-certbot \
python314-certbot \
python3dist-certbot"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-acme \
python314-configargparse \
python314-configobj \
python314-cryptography \
python314-distro \
python314-josepy \
python314-parsedatetime \
python314-pyRFC3339"

inherit rpm
