SUMMARY = "OpenID Connect support for Flask"
DESCRIPTION = "This library should work with any standards compliant OpenID Connect provider. \
 \
It has been tested with: \
* Ipsilon"
LICENSE = "BSD-2-Clause"

PV = "2.4.0"

RPM_NAME = "python314-flask-oidc-2.4.0-1.4.noarch.rpm"
RPM_HASH = "6e010cf543f6a2f3679f7bb51c1e889df63b2969db35ee71aa02ee6279177d261ed8fecaaf46fbea0bde0ca8416e2bdad773852315d0d75c28ec7aa8e6e34b55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flask-oidc \
python314-flask-oidc \
python3dist-flask-oidc"

RDEPENDS:${PN} += "python-abi \
python314-Authlib \
python314-Flask \
python314-blinker \
python314-requests"

inherit rpm
