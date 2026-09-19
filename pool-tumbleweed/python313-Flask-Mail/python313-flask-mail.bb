SUMMARY = "Flask extension for sending email"
DESCRIPTION = "A Flask extension for sending email messages."
LICENSE = "BSD-3-Clause"

PV = "0.10.0"

RPM_NAME = "python313-Flask-Mail-0.10.0-1.2.noarch.rpm"
RPM_HASH = "a31a663373e4fc05d6b91b0a4325b86e3a7532fb9fda4184b2184a215942ee9a858982d8ee7f93ac763cb00b53da4d2239a250becd1b6e4c35884b2812be2196"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-Mail \
python3.13dist-flask-mail \
python313-Flask-Mail \
python3dist-flask-mail"

RDEPENDS:${PN} += "python-abi \
python313-Flask \
python313-blinker"

inherit rpm
