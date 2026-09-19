SUMMARY = "i18n and l10n support for Flask"
DESCRIPTION = "This module implements i18n and l10n support for Flask. It is based on \
the Python babel module as well as pytz."
LICENSE = "BSD-3-Clause"

PV = "4.1.0"

RPM_NAME = "python314-Flask-Babel-4.1.0-2.4.noarch.rpm"
RPM_HASH = "1595ab4c21ace6c506de3c40ead7e4481cd89760c83fa459b3b06c72308072e60a6aa56b7530e451ca81cb75160b6bd20a45ee53e91b893b633ad333f9341e1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flask-babel \
python314-Flask-Babel \
python3dist-flask-babel"

RDEPENDS:${PN} += "python-abi \
python314-Babel \
python314-Flask \
python314-Jinja2 \
python314-pytz"

inherit rpm
