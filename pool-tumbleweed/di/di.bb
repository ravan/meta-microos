SUMMARY = "Disk Information Utility"
DESCRIPTION = "di is a disk information utility that displays everything that df does and \
more. It features the ability to display your disk usage in whatever format you \
prefer. It also checks the user and group quotas, so that the user sees the \
space available for their use, not the system wide disk space. It is designed \
to be highly portable across many platforms and is great for heterogenous \
networks."
LICENSE = "Zlib"

PV = "6.2.2.2"

RPM_NAME = "di-6.2.2.2-1.4.aarch64.rpm"
RPM_HASH = "f6e1418e5bc86ca4fa547c589985c53f93a35c673ac71b7702a11b1bb835385132a5c1dd31ab04a9c176b280583d78c5e12f8602431d46c835fd4507d6672683"

RPROVIDES:${PN} += "di"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdi.so.6"

inherit rpm
