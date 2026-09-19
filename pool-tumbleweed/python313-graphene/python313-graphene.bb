SUMMARY = "GraphQL Framework for Python"
DESCRIPTION = "Graphene is a Python library for building GraphQL schemas/types."
LICENSE = "MIT"

PV = "3.4.3"

RPM_NAME = "python313-graphene-3.4.3-1.9.noarch.rpm"
RPM_HASH = "e92486f559020a72bc937aa18cfb824bfc8569fcdc39b5aecc6b6072b06619c2d861c1051a22da20208129f303387d58c439a107ec1813423f7af76f438146e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-graphene \
python3.13dist-graphene \
python313-graphene \
python3dist-graphene"

RDEPENDS:${PN} += "python-abi \
python313-graphql-core \
python313-graphql-relay \
python313-python-dateutil \
python313-typing-extensions"

inherit rpm
