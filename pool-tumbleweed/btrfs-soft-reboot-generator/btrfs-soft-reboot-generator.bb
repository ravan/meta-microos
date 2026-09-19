SUMMARY = "systemd generator to let services survive a soft-reboot"
DESCRIPTION = "This package contains a systemd generator, which will, based on ini style config \
files, create system unit snippets during boot. This snippets contain the systemd \
unit config, so that this service will not be killed by a soft-reboot."
LICENSE = "Apache-2.0"

PV = "20240918.c86bd4f"

RPM_NAME = "btrfs-soft-reboot-generator-20240918.c86bd4f-1.9.aarch64.rpm"
RPM_HASH = "a48ec06cd3d80cec3edf2e98247faceae53552df8d88a5970b055ce4bc298d1b50dc801f71d894e5ca727e2ffa6b428816b0db6c4bf21bf39a93c62c0ae77c13"

RPROVIDES:${PN} += "btrfs-soft-reboot-generator"

RDEPENDS:${PN} += "/usr/bin/sh \
attr \
ld-linux-aarch64.so.1 \
libc.so.6 \
libeconf.so.0 \
libmount.so.1"

inherit rpm
