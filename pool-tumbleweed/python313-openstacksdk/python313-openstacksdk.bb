SUMMARY = "An SDK for building applications to work with OpenStack"
DESCRIPTION = "The openstacksdk is a library for building applications to work \
with OpenStack clouds. \
The project aims to provide a consistent and complete set of \
interactions with OpenStack's many services, along with complete \
documentation, examples, and tools."
LICENSE = "Apache-2.0"

PV = "4.20.0"

RPM_NAME = "python313-openstacksdk-4.20.0-1.1.noarch.rpm"
RPM_HASH = "075d6b062a21e054a188337ff29f3430aa7b3a4e8506dffd958b1aee95c7fe4a19811d6bcd53c00d272424f34c6d9c60865fa6a66666cbed80d3293cb8b1305b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-openstacksdk \
python3.13dist-openstacksdk \
python313-openstacksdk \
python3dist-openstacksdk"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
mkisofs \
python-abi \
python313-PyYAML \
python313-cryptography \
python313-decorator \
python313-dogpile.cache \
python313-iso8601 \
python313-jmespath \
python313-jsonpatch \
python313-keystoneauth1 \
python313-os-service-types \
python313-platformdirs \
python313-psutil \
python313-typing-extensions"

inherit rpm
