SUMMARY = "OpenID Connect Provider implementation for Django"
DESCRIPTION = "OpenID Connect Provider implementation for Django."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python314-django-oidc-provider-0.9.0-1.3.noarch.rpm"
RPM_HASH = "d8e3c2befb229db53e16193fc1949af5c80c118645818d29f94c3d95aa759edbe0964843e2319ca2a19fb81f8d7ce971783fa35e28868ce5428ab298c984c22c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-oidc-provider \
python314-django-oidc-provider \
python3dist-django-oidc-provider"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-PyJWT \
python314-cryptography"

inherit rpm
