SUMMARY = "Identity management for flask"
DESCRIPTION = "Flask-Principal provides a very loose framework to tie in providers of \
two types of services, often located in different parts of a web application: \
Authentication providers and User information providers."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python314-Flask-Principal-0.4.0-5.5.noarch.rpm"
RPM_HASH = "171399bb717b22beaf78774ef97e262f0f89e721ebedca60607cc4d1df53231588cb1b1938ddaca090c5302676beec4f6772f14cb53bb4f622e0d35b42d4fb96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flask-principal \
python314-Flask-Principal \
python3dist-flask-principal"

RDEPENDS:${PN} += "python-abi \
python314-Flask \
python314-blinker"

inherit rpm
