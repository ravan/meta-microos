SUMMARY = "Fence agent for use with kdump crash recovery service"
DESCRIPTION = "Fence agent for use with kdump crash recovery service."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "4.17.0+git.1786356985.d90bec5f"

RPM_NAME = "fence-agents-kdump-4.17.0+git.1786356985.d90bec5f-1.1.aarch64.rpm"
RPM_HASH = "a3fb765c303a27c8a90cc7265d6ebf769e1e455ca388d7fa50d2151f93bd730a7750b6aac989c60d01117cc78cd58010ce08c4311d0e9fd9dca936b8c4e67dad"

RPROVIDES:${PN} += "fence-agents-kdump"

RDEPENDS:${PN} += "fence-agents-common \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
