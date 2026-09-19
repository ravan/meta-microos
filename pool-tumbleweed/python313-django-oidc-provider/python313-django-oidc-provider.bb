SUMMARY = "OpenID Connect Provider implementation for Django"
DESCRIPTION = "OpenID Connect Provider implementation for Django."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python313-django-oidc-provider-0.9.0-1.3.noarch.rpm"
RPM_HASH = "f66014a7f7060100adab571f4c673aa7f2ded6e282af90ebb37bf6d464cd0057e8e542a9315c2393de68b9a14b99d953f4d951a6d19ca80b586b1f6da0397c2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-oidc-provider \
python3.13dist-django-oidc-provider \
python313-django-oidc-provider \
python3dist-django-oidc-provider"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-PyJWT \
python313-cryptography"

inherit rpm
