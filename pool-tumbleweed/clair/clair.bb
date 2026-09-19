SUMMARY = "Vulnerability Static Analysis for Containers"
DESCRIPTION = "Clair is an open source project for the static analysis of vulnerabilities in \
application containers (currently including OCI and docker). \
 \
Clients use the Clair API to index their container images and can then match it \
against known vulnerabilities. \
 \
Our goal is to enable a more transparent view of the security of \
container-based infrastructure. Thus, the project was named Clair after the \
French term which translates to clear, bright, transparent."
LICENSE = "Apache-2.0"

PV = "4.9.0"

RPM_NAME = "clair-4.9.0-1.4.aarch64.rpm"
RPM_HASH = "b6c4ccc8b10e1788d6f53b9a8d9045eea9cf11684e3bbdc84c0968633bf92a7bc935573a2ce6947f59dda450bb61328b48ba696624536fe3553e5c9104387e5e"

RPROVIDES:${PN} += "clair"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6"

inherit rpm
