SUMMARY = "Microsoft Azure Schema Registry Avro Encoder Client Library for Python"
DESCRIPTION = "Azure Schema Registry is a schema repository service hosted by Azure Event Hubs, providing \
schema storage, versioning, and management. This package provides an Avro encoder capable \
of encoding and decoding payloads containing Schema Registry schema identifiers and \
Avro-encoded content."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-schemaregistry-avroencoder-1.0.0-2.8.noarch.rpm"
RPM_HASH = "c839922dadf08e65c9406ed7f249113d279ccd5c0f43841554b4430528984e48bff855c2df4454c6e02e8262480fcd99d64421d6d9a99a60cd78edd0abad1f1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-schemaregistry-avroencoder \
python3.13dist-azure-schemaregistry-avroencoder \
python313-azure-schemaregistry-avroencoder \
python3dist-azure-schemaregistry-avroencoder"

RDEPENDS:${PN} += "-python313-azure-schemaregistry >= 1.0.0 with python313-azure-schemaregistry < 2.0.0 \
python-abi \
python313-avro \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
