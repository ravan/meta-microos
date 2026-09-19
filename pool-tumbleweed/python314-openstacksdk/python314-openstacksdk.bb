SUMMARY = "An SDK for building applications to work with OpenStack"
DESCRIPTION = "The openstacksdk is a library for building applications to work \
with OpenStack clouds. \
The project aims to provide a consistent and complete set of \
interactions with OpenStack's many services, along with complete \
documentation, examples, and tools."
LICENSE = "Apache-2.0"

PV = "4.20.0"

RPM_NAME = "python314-openstacksdk-4.20.0-1.1.noarch.rpm"
RPM_HASH = "87f3dc6ce391d200df33c23f251768e1de22e472a480e5b154d8667e4be24ab1a91e01e67fb253f7a53218dc2e0b851c2beda6fc8e93c32ce472ab8b9d4d2025"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-openstacksdk \
python314-openstacksdk \
python3dist-openstacksdk"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
mkisofs \
python-abi \
python314-PyYAML \
python314-cryptography \
python314-decorator \
python314-dogpile.cache \
python314-iso8601 \
python314-jmespath \
python314-jsonpatch \
python314-keystoneauth1 \
python314-os-service-types \
python314-platformdirs \
python314-psutil \
python314-typing-extensions"

inherit rpm
