SUMMARY = "CLI for the Clair Vulnerability scanner"
DESCRIPTION = "clairctl is a command line tool for working with Clair. This CLI is capable of \
generating manifests from most public registries (dockerhub, quay.io, Red Hat \
Container Catalog) and submitting them for analysis to a running Clair."
LICENSE = "Apache-2.0"

PV = "4.9.0"

RPM_NAME = "clairctl-4.9.0-1.4.aarch64.rpm"
RPM_HASH = "06571f3f9043dc4108e43a1cd753f6f618d78ff30c1eee09d3b883ea104507c18418aaf8bd383aed6b8f5fb25b512a7a1ec6ca18d1fc1437eb585dbe61bd2b3e"

RPROVIDES:${PN} += "clairctl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
