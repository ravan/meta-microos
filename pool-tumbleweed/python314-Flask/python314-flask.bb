SUMMARY = "A microframework based on Werkzeug, Jinja2 and good intentions"
DESCRIPTION = "Flask is a microframework for Python based on Werkzeug, Jinja 2 and good \
intentions. And before you ask: It's BSD licensed!"
LICENSE = "BSD-3-Clause"

PV = "3.1.3"

RPM_NAME = "python314-Flask-3.1.3-2.2.noarch.rpm"
RPM_HASH = "d0e88cab1a8d4f1e0af52bf1d981a36317e00106ac7eedc7fc58c3de6a9ee7d993dbc51a36f8de23c067d2397199dfa30196acaf4f836d92f43057327972ea15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flask \
python314-Flask \
python3dist-flask"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-Jinja2 \
python314-MarkupSafe \
python314-Werkzeug \
python314-blinker \
python314-click \
python314-itsdangerous"

inherit rpm
