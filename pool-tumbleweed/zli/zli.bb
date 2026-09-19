SUMMARY = "CLI for the Zot container registry"
DESCRIPTION = "zot is a production-ready vendor-neutral OCI image registry - images stored in \
OCI image format, distribution specification on-the-wire, that's it! \
 \
This package contains the CLI to interact with a Zot registry instance."
LICENSE = "Apache-2.0"

PV = "2.1.20"

RPM_NAME = "zli-2.1.20-1.2.aarch64.rpm"
RPM_HASH = "b781bca7d79c1bc556b79bef6d20fb1e5f00a26e46b8b0aa84673fa34c5f51f4d3475c4c6384b43b37b500778f38ab959bcaf4d870e8aac50c06173ecb815cfd"

RPROVIDES:${PN} += "zli"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
