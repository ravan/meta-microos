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

RPM_NAME = "python313-Flask-Login-0.6.3-2.5.noarch.rpm"
RPM_HASH = "c8f8f3bee9da2752b57ef227719f241765d67aede98f8841bc3b14c1c5d6af870f3f465af26093a8ebd7bff352d01d2ee3e35790c80eca31399362b973db0598"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-Login \
python3.13dist-flask-login \
python313-Flask-Login \
python3dist-flask-login"

RDEPENDS:${PN} += "python-abi \
python313-Flask"

inherit rpm
