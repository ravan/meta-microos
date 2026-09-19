SUMMARY = "Graphene Django integration"
DESCRIPTION = "Graphene Django integration."
LICENSE = "MIT"

PV = "3.2.3"

RPM_NAME = "python313-graphene-django-3.2.3-2.1.noarch.rpm"
RPM_HASH = "6224fcf567641f5b3ec4c2cf9b4ec06df3bae7500b6b973730bd1227bc4199a42593a9a25cb73fee4e5ce397059a327f57604a4292da6f4e07665cb06ee949f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-graphene-django \
python3.13dist-graphene-django \
python313-graphene-django \
python3dist-graphene-django"

RDEPENDS:${PN} += "-python313-Django >= 3.2 with python313-Django < 6 \
python-abi \
python313-graphene \
python313-graphql-core \
python313-graphql-relay \
python313-promise \
python313-text-unidecode"

inherit rpm
