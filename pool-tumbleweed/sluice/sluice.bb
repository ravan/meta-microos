SUMMARY = "Rate limiting data piping tool"
DESCRIPTION = "Sluice reads from standard input and write to standard output at a specified \
data rate. This can be useful for benchmarking and exercising I/O streaming at \
desired throughput rates."
LICENSE = "GPL-2.0-or-later"

PV = "0.03.01"

RPM_NAME = "sluice-0.03.01-1.5.aarch64.rpm"
RPM_HASH = "94630064d87d13f083ec16d906e31e5984a81e5ab5a884c985512c0b90bc13b52089ea518ff5eb9d5ac8752311a0eb8e941fbafae409ed3edb6801283bb5f8d6"

RPROVIDES:${PN} += "sluice"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
