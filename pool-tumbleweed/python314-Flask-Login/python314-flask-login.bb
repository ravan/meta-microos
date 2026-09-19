SUMMARY = "User session management for Flask"
DESCRIPTION = "Flask-Login provides user session management for Flask. It handles the common \
tasks of logging in, logging out, and remembering your users' \
sessions over extended periods of time. \
 \
Flask-Login is not bound to any particular database system or permissions \
model. The only requirement is that your user objects implement a few \
methods, and that you provide a callback to the extension capable of \
loading users from their ID."
LICENSE = "MIT"

PV = "0.6.3"

RPM_NAME = "python314-Flask-Login-0.6.3-2.5.noarch.rpm"
RPM_HASH = "ee77e03c53d864f6994fb12be48b59899427540e6bc672d13ff1bc71bf7040f9d912fa54ca189dde4d4deabcc636f23f7f64e690ee0005ac1aa4a0516dc30fc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flask-login \
python314-Flask-Login \
python3dist-flask-login"

RDEPENDS:${PN} += "python-abi \
python314-Flask"

inherit rpm
