SUMMARY = "An SDK for building applications to work with OpenStack - Documentation"
DESCRIPTION = "The openstacksdk is a library for building applications to work \
with OpenStack clouds. \
The project aims to provide a consistent and complete set of \
interactions with OpenStack's many services, along with complete \
documentation, examples, and tools. \
 \
The openstacksdk is a collection of libraries for building \
applications to work with OpenStack clouds."
LICENSE = "Apache-2.0"

PV = "4.20.0"

RPM_NAME = "python-openstacksdk-doc-4.20.0-1.1.noarch.rpm"
RPM_HASH = "620b25ebd9a4dfb317ff502a149dfc9e94364e97fed6d947b3f44e36799ded7b4c0746c21c6c8a7b110112636cc0d955697db7e986cd7fd1cbc68a3167628ba0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-openstacksdk-doc"

RDEPENDS:${PN} += ""

inherit rpm
