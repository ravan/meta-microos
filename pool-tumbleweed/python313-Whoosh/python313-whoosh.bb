SUMMARY = "Pure-Python full text indexing, search, and spell checking library"
DESCRIPTION = "Whoosh is a pure-Python indexing and search library. It can be used \
to add search functionality to applications and websites. Every part \
of how Whoosh works can be extended or replaced to meet specific \
needs."
LICENSE = "BSD-2-Clause"

PV = "2.7.5"

RPM_NAME = "python313-Whoosh-2.7.5-1.5.noarch.rpm"
RPM_HASH = "27f5a8b8f65b75c3b486782ac97b42674b48c7c529b58f34f555fb4c12599fc5d4197d0c7a698ba8d84a0d0f5f4a646600b3a5caab7f85d84e1b785cf668f900"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Whoosh \
python3.13dist-whoosh-reloaded \
python313-Whoosh \
python3dist-whoosh-reloaded"

RDEPENDS:${PN} += "python-abi \
python313-cached-property"

inherit rpm
