SUMMARY = "JSON Web Token for Django GraphQL"
DESCRIPTION = "JSON Web Token for Django GraphQL"
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python314-django-graphql-jwt-0.4.0-1.9.noarch.rpm"
RPM_HASH = "1d17d6372b0905eb7827b0cdf077a00b21388e54693dc6833487b165bcd7de8fd7dd4d5f3e1c513c93637c7e7aba3da62ae3ec45e0126c8832af59f8331ba688"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-graphql-jwt \
python314-django-graphql-jwt \
python3dist-django-graphql-jwt"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-PyJWT \
python314-graphene \
python314-graphene-django"

inherit rpm
