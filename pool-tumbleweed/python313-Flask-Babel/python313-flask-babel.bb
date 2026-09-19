SUMMARY = "i18n and l10n support for Flask"
DESCRIPTION = "This module implements i18n and l10n support for Flask. It is based on \
the Python babel module as well as pytz."
LICENSE = "BSD-3-Clause"

PV = "4.1.0"

RPM_NAME = "python313-Flask-Babel-4.1.0-2.4.noarch.rpm"
RPM_HASH = "1c815468043a4ab4c8434cd377fc5cad243455f315f7a9d2d910f14d28da6fdbb62f9a6cbc46611dd7743667fcaea5e35f69896a60c75b7e37995a9ec1fc1f66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-Babel \
python3.13dist-flask-babel \
python313-Flask-Babel \
python3dist-flask-babel"

RDEPENDS:${PN} += "python-abi \
python313-Babel \
python313-Flask \
python313-Jinja2 \
python313-pytz"

inherit rpm
