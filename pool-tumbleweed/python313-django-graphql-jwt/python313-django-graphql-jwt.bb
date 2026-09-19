SUMMARY = "JSON Web Token for Django GraphQL"
DESCRIPTION = "JSON Web Token for Django GraphQL"
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python313-django-graphql-jwt-0.4.0-1.9.noarch.rpm"
RPM_HASH = "5861cff95eac0bf3aef7106db230223e08f0cc8f5a64dfd20702019d9ac2b5292ca9933fa63e1bb0924cb032cf489287a6db2f4ef4d91871485b9698c52813f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-graphql-jwt \
python3.13dist-django-graphql-jwt \
python313-django-graphql-jwt \
python3dist-django-graphql-jwt"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-PyJWT \
python313-graphene \
python313-graphene-django"

inherit rpm
