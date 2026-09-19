SUMMARY = "Microsoft Azure Schema Registry Avro Encoder Client Library for Python"
DESCRIPTION = "Azure Schema Registry is a schema repository service hosted by Azure Event Hubs, providing \
schema storage, versioning, and management. This package provides an Avro encoder capable \
of encoding and decoding payloads containing Schema Registry schema identifiers and \
Avro-encoded content."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-schemaregistry-avroencoder-1.0.0-2.8.noarch.rpm"
RPM_HASH = "98241b3c67e212d19e3c5561616aa158e1baa65bf13dd3799a02d3909a82d1f0357084c9ed5887c7bcb15c4496018601505a2b888643d4e983852014e8fe9483"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-schemaregistry-avroencoder \
python314-azure-schemaregistry-avroencoder \
python3dist-azure-schemaregistry-avroencoder"

RDEPENDS:${PN} += "-python314-azure-schemaregistry >= 1.0.0 with python314-azure-schemaregistry < 2.0.0 \
python-abi \
python314-avro \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
