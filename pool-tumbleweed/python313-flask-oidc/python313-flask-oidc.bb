SUMMARY = "OpenID Connect support for Flask"
DESCRIPTION = "This library should work with any standards compliant OpenID Connect provider. \
 \
It has been tested with: \
* Ipsilon"
LICENSE = "BSD-2-Clause"

PV = "2.4.0"

RPM_NAME = "python313-flask-oidc-2.4.0-1.4.noarch.rpm"
RPM_HASH = "716c68cbcaa76fdeefac7f62ee82a4b54d41dbc8a0152e3c5931a5af4b99b25eaf74fc473681bc8784601fa487f393f435a844987ee4f5a83ac71784d9892995"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flask-oidc \
python3.13dist-flask-oidc \
python313-flask-oidc \
python3dist-flask-oidc"

RDEPENDS:${PN} += "python-abi \
python313-Authlib \
python313-Flask \
python313-blinker \
python313-requests"

inherit rpm
