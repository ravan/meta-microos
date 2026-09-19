SUMMARY = "Minimalistic C client for Redis"
DESCRIPTION = "Hiredis is a minimalistic C client library for the \
Redis database."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "hiredis-1.3.0-1.6.aarch64.rpm"
RPM_HASH = "fefd93d202c67293b4fbd6d1ca6866c77054a4b133a0cd98d19afa9c1e864bfe4e6ed37acc59211501b100283cf83d867fd19ccd48c5ea4f21abd1eba012085f"

RPROVIDES:${PN} += "hiredis"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm
