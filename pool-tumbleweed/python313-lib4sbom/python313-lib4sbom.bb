SUMMARY = "Library to ingest and generate SBOMs"
DESCRIPTION = "Lib4SBOM is a library to parse and generate Software Bill of Materials (SBOMs). \
It supports SBOMs created in both SPDX and CycloneDX formats. \
 \
It has been developed on the assumption that having a generic abstraction of SBOM \
regardless of the underlying format will be useful to developers. \
 \
The following facilities are provided: \
 \
 * Generate SPDX SBOM in TagValue, JSON and YAML formats \
 * Generate CycloneDX SBOM in JSON format \
 * Parse SPDX SBOM in TagValue, JSON, YAML, XML and RDF formats \
 * Parse CycloneDX SBOM in JSON and XMLformat \
 * Create and manipulate a SBOM file object \
 * Create and manipulate a SBOM package object \
 * Create and manipulate a SBOM dependency relationship object \
 * Create and manipulate a Vulnerability object \
 * Create and manipulate a Software Service object \
 * Generated SBOM can be output to a file or to the console"
LICENSE = "Apache-2.0"

PV = "0.10.4"

RPM_NAME = "python313-lib4sbom-0.10.4-2.1.noarch.rpm"
RPM_HASH = "a56f1a3d46377cebe7537ddb6dc9eaa35dad379d3f88c6ae2653dec3325f6353a7cad68addab0c9a4f478cd9a0acfe4a4f2496df13f29d2c8cd6af6c2cef648b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-lib4sbom \
python3.13dist-lib4sbom \
python313-lib4sbom \
python3dist-lib4sbom"

RDEPENDS:${PN} += "python-abi \
python313-PyYAML \
python313-defusedxml \
python313-fastjsonschema \
python313-jsonschema \
python313-packageurl-python \
python313-semantic-version \
python313-xmlschema"

inherit rpm
