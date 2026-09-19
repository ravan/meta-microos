SUMMARY = "CLI tool and API server DNS client implemented in Go"
DESCRIPTION = "doggo is a modern command-line DNS client (like dig) implemented in Go. \
It outputs information in a neat concise manner and supports protocols \
like DoH, DoT, DoQ, and DNSCrypt as well."
LICENSE = "GPL-3.0-only"

PV = "1.3.0"

RPM_NAME = "doggo-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "97e8af9fb09623baae004e764f11dcacd15acabbab504c1e41e61cc7e41bfedaec213a04e4e3e16605aa4ee328b5eea25c93b2deab6b588ee5832ac60b84a51c"

RPROVIDES:${PN} += "doggo"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
