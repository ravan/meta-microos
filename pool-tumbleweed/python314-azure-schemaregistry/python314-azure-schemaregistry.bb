SUMMARY = "Microsoft Azure Schema Registry Client Library for Python"
DESCRIPTION = "Azure Schema Registry is a schema repository service hosted by Azure Event Hubs, \
providing schema storage, versioning, and management. The registry is leveraged \
by serializers to reduce payload size while describing payload structure with \
schema identifiers rather than full schemas."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python314-azure-schemaregistry-1.3.0-1.9.noarch.rpm"
RPM_HASH = "a9d34ce22cbd7876e1572721191dbd3179070af8f82f0cb63ab82bf6e9ccfb82fed891ad933340097bbc30fb0b8884c9587abc64099f12c9d0fed605279767ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-schemaregistry \
python314-azure-schemaregistry \
python3dist-azure-schemaregistry"

RDEPENDS:${PN} += "-python314-azure-core >= 1.28.0 with python314-azure-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
