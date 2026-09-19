SUMMARY = "A command-line interface for Hetzner Cloud"
DESCRIPTION = "hcloud is a command-line interface for interacting with Hetzner Cloud."
LICENSE = "MIT"

PV = "1.67.0"

RPM_NAME = "hcloud-cli-1.67.0-1.1.aarch64.rpm"
RPM_HASH = "b3c8b23f2bd01b3b58618d5e405a77a95a3fa1e93a7e60631a468a18f11ea51fd2112d1d2cf9e3be15e9f611156301cc82c450facd3eac654a38796fc463c3f4"

RPROVIDES:${PN} += "hcloud \
hcloud-cli"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
