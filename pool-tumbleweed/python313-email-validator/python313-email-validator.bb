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

RPM_NAME = "python313-email-validator-2.3.0-1.4.noarch.rpm"
RPM_HASH = "c5ce6a47577f2e967a22d71fe19333966e04a13b91ec19dd0e8948b38295edc14dbb68883a1d01810d5508e170f96c69ddb6c841607f5565475269fca621fbea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-email-validator \
python3.13dist-email-validator \
python313-email-validator \
python3dist-email-validator"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-dnspython \
python313-idna"

inherit rpm
