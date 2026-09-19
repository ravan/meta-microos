SUMMARY = "Contains the gatekeeper service to allow user access to system log"
DESCRIPTION = "Contains the gatekeeper service which allows the user to access the system \
logs. The service itself listens to a socket to which is sends the file descriptors \
to the system log if authorized via polkit."
LICENSE = "MIT"

PV = "0.3.4"

RPM_NAME = "mcp-server-systemd-gatekeeper-0.3.4-2.3.aarch64.rpm"
RPM_HASH = "a666b6862e20604ab120aea7c395dea778788645cfb5050b00ea94f3c6e2a622fc0a7e80c4d9f1fb176f52df6cdee083f282c1d84306829a76c5220372161c3f"

RPROVIDES:${PN} += "mcp-server-systemd-gatekeeper"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
mcp-server-systemd"

inherit rpm
