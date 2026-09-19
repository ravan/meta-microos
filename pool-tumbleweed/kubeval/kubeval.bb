SUMMARY = "Validate your Kubernetes configuration files"
DESCRIPTION = "kubeval is a tool for validating a Kubernetes YAML or JSON configuration file. It does so using schemas generated from the Kubernetes OpenAPI specification, and therefore can validate schemas for multiple versions of Kubernetes."
LICENSE = "Apache-2.0"

PV = "0.16.1"

RPM_NAME = "kubeval-0.16.1-1.26.aarch64.rpm"
RPM_HASH = "32b3dfea5c80a5df53fb4a6fbbd63cf031626e8ac5b8657c684801479f4cccedd34610b1dfd345b71db1c78bee990d25ae4559e9b17300daa88766469561ee23"

RPROVIDES:${PN} += "kubeval"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
