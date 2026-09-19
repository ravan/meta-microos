SUMMARY = "Trace a DNS record to its start of authority"
DESCRIPTION = "Dnstracer determines where a given Domain Name Server (DNS) gets its \
information from, and follows the chain of DNS servers back to the \
servers which know the data."
LICENSE = "BSD-2-Clause"

PV = "1.10"

RPM_NAME = "dnstracer-1.10-1.18.aarch64.rpm"
RPM_HASH = "2b2b33ec2500d5b7fd5b4c233c784b166a5de3f29a9a750d3d00a2269b44947619fb486988ed303e20421db2b135371a2db88c693885b98d42a3cd269422127e"

RPROVIDES:${PN} += "dnstracer"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
