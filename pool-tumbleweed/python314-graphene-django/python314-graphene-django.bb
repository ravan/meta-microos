SUMMARY = "Graphene Django integration"
DESCRIPTION = "Graphene Django integration."
LICENSE = "MIT"

PV = "3.2.3"

RPM_NAME = "python314-graphene-django-3.2.3-2.1.noarch.rpm"
RPM_HASH = "070e7db4aab027532af0b68a6c87104d937b27a75c651c0e3139276491392acb8f755a316fc701f0515442dd6106dd22fe7fbafd091d14b547450ad911ebf8d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-graphene-django \
python314-graphene-django \
python3dist-graphene-django"

RDEPENDS:${PN} += "-python314-Django >= 3.2 with python314-Django < 6 \
python-abi \
python314-graphene \
python314-graphql-core \
python314-graphql-relay \
python314-promise \
python314-text-unidecode"

inherit rpm
