SUMMARY = "Microsoft Azure Schema Registry Avro Serializer Client Library for Python"
DESCRIPTION = "Azure Schema Registry is a schema repository service hosted by Azure Event Hubs, providing \
schema storage, versioning, and management. This package provides an Avro serializer capable \
of serializing and deserializing payloads containing Schema Registry schema identifiers and \
Avro-encoded data."
LICENSE = "MIT"

PV = "1.0.0b4"

RPM_NAME = "python314-azure-schemaregistry-avroserializer-1.0.0b4-3.8.noarch.rpm"
RPM_HASH = "b0f71c9280746e2ffb7eed705af2fe36e55beb3940540ac6e6dec170e76bdd5ea8fee4606125e9721d8c28bc5d27d508e1b640a2bf9d94d46e77f9c761121b36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-schemaregistry-avroserializer \
python314-azure-schemaregistry-avroserializer \
python3dist-azure-schemaregistry-avroserializer"

RDEPENDS:${PN} += "python-abi \
python314-avro \
python314-azure-core \
python314-azure-nspkg \
python314-azure-schemaregistry \
python314-msrest"

inherit rpm
