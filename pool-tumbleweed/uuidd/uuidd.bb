SUMMARY = "Helper daemon to guarantee uniqueness of time-based UUIDs"
DESCRIPTION = "The uuidd package contains a userspace daemon (uuidd) which guarantees \
uniqueness of time-based UUID generation even at very high rates on \
SMP systems."
LICENSE = "GPL-2.0-or-later"

PV = "2.42.2"

RPM_NAME = "uuidd-2.42.2-2.1.aarch64.rpm"
RPM_HASH = "0f23a42d5bf25e4fc834c36f4cc2642d913a014a68d7ad3a2fb83c1364a133e2734148d5de2e9d0afdfe982ceb52d1a039be5dbfc9bb9e7195ebcbc9662cffa3"

RPROVIDES:${PN} += "uuid-runtime \
uuidd"

RDEPENDS:${PN} += "/usr/bin/sh \
group-uuidd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd.so.0 \
libuuid--uuid-generate-time-cont \
libuuid.so.1 \
systemd \
user-uuidd"

inherit rpm
