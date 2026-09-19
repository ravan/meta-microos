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

RPM_NAME = "python314-lib4sbom-0.10.4-2.1.noarch.rpm"
RPM_HASH = "9d69b0908bb948b10b641b46db10fb5c6ef00e162449c9cda0b6663bebe9f270fc3498ca0875ad3ed1ec59de1c5e13f44d8f42ed62b2435cf60f2486e97f4ebf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-lib4sbom \
python314-lib4sbom \
python3dist-lib4sbom"

RDEPENDS:${PN} += "python-abi \
python314-PyYAML \
python314-defusedxml \
python314-fastjsonschema \
python314-jsonschema \
python314-packageurl-python \
python314-semantic-version \
python314-xmlschema"

inherit rpm
