SUMMARY = "A robust email syntax and deliverability validation library for Python"
DESCRIPTION = "A robust email address syntax and deliverability validation library \
for Python 2.7/3.4 by Joshua Tauberer. \
 \
This library validates that address are of the form ``x@y.com``. This is \
the sort of validation you would want for a login form on a website. \
 \
Key features: \
 \
* Good for validating email addresses used for logins/identity. \
* Friendly error messages when validation fails (appropriate to show to end users). \
* (optionally) Checks deliverability: Does the domain name resolve? \
* Supports internationalized domain names and (optionally) internationalized local parts. \
* Normalizes email addresses (super important for internationalized addresses! see below)."
LICENSE = "CC0-1.0"

PV = "2.3.0"

RPM_NAME = "python314-email-validator-2.3.0-1.4.noarch.rpm"
RPM_HASH = "4e0aa8d57458a0c1c1cf4cd74163a4f4e88a5e7c1bb45087bcd154b382a1a680d123ea4489494167fd7a915693caf59098865a3277ad7ff8b8c52876a456e18c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-email-validator \
python314-email-validator \
python3dist-email-validator"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-dnspython \
python314-idna"

inherit rpm
