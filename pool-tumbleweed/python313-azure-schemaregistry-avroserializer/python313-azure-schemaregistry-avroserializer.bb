SUMMARY = "Microsoft Azure Schema Registry Avro Serializer Client Library for Python"
DESCRIPTION = "Azure Schema Registry is a schema repository service hosted by Azure Event Hubs, providing \
schema storage, versioning, and management. This package provides an Avro serializer capable \
of serializing and deserializing payloads containing Schema Registry schema identifiers and \
Avro-encoded data."
LICENSE = "MIT"

PV = "1.0.0b4"

RPM_NAME = "python313-azure-schemaregistry-avroserializer-1.0.0b4-3.8.noarch.rpm"
RPM_HASH = "472595f55efe7f8537b611d1ee51ef8f0a5a27bac3a7f6d49bc78e5bcef6ba1416b0521cf786fb6e875de5a0cabaf3153134d460a31230b923cd2923251b95f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-schemaregistry-avroserializer \
python3.13dist-azure-schemaregistry-avroserializer \
python313-azure-schemaregistry-avroserializer \
python3dist-azure-schemaregistry-avroserializer"

RDEPENDS:${PN} += "python-abi \
python313-avro \
python313-azure-core \
python313-azure-nspkg \
python313-azure-schemaregistry \
python313-msrest"

inherit rpm
