SUMMARY = "Microsoft Azure Schema Registry Client Library for Python"
DESCRIPTION = "Azure Schema Registry is a schema repository service hosted by Azure Event Hubs, \
providing schema storage, versioning, and management. The registry is leveraged \
by serializers to reduce payload size while describing payload structure with \
schema identifiers rather than full schemas."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python313-azure-schemaregistry-1.3.0-1.9.noarch.rpm"
RPM_HASH = "bf39021d333f03c43e8a1f2513a42205c928ecad93a9d79a86999937bcd90978bc138545fb10a814954b8a23d1c88faeba64f69543f219ba403b1b400df27338"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-schemaregistry \
python3.13dist-azure-schemaregistry \
python313-azure-schemaregistry \
python3dist-azure-schemaregistry"

RDEPENDS:${PN} += "-python313-azure-core >= 1.28.0 with python313-azure-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
