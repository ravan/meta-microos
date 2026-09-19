SUMMARY = "Entrypoint for the sidecar-shim container"
DESCRIPTION = "The package provides sidecar-shim binary than will call the respective \
hooks with the proper command-line arguments."
LICENSE = "Apache-2.0"

PV = "1.9.0"

RPM_NAME = "kubevirt1.9-sidecar-shim-1.9.0-3.1.aarch64.rpm"
RPM_HASH = "8cb5792cb05b2721a0a944453f6e85f984a9b26244b28824cdd35f2fe62287f057b99d84a46f73263020ac99b45ae2800ff45865a38fa4605da0151a15ae4c88"

RPROVIDES:${PN} += "kubevirt-sidecar-shim \
kubevirt1.9-sidecar-shim"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
