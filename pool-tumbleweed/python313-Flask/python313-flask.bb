SUMMARY = "A microframework based on Werkzeug, Jinja2 and good intentions"
DESCRIPTION = "Flask is a microframework for Python based on Werkzeug, Jinja 2 and good \
intentions. And before you ask: It's BSD licensed!"
LICENSE = "BSD-3-Clause"

PV = "3.1.3"

RPM_NAME = "python313-Flask-3.1.3-2.2.noarch.rpm"
RPM_HASH = "3ce7e1b6bec5a1abb069e3957b2684e89de096d8ea0446071ba09c6689d500df22418bda606ed000d82acf0a3e8cc3d47fae27c9856a01f188e575d52ae9f992"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask \
python3.13dist-flask \
python313-Flask \
python3dist-flask"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-Jinja2 \
python313-MarkupSafe \
python313-Werkzeug \
python313-blinker \
python313-click \
python313-itsdangerous"

inherit rpm
