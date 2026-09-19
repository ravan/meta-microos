SUMMARY = "Icinga 2 binaries and libraries"
DESCRIPTION = "Icinga 2 is a general-purpose network monitoring application. \
This subpackage provides the binaries for Icinga 2 Core."
LICENSE = "GPL-3.0-or-later"

PV = "2.16.5"

RPM_NAME = "icinga2-bin-2.16.5-1.2.aarch64.rpm"
RPM_HASH = "0b7f329ad62a85092285d2ce71974d79cde293856f8caa983e5ae254a9ff05817d04a413b2b3662d0652369ea52a5f8e612404f4748e21be67a01420855e20ec"

RPROVIDES:${PN} += "icinga2-bin \
monitoring-daemon"

RDEPENDS:${PN} += "icinga2-bin \
ld-linux-aarch64.so.1 \
libboost-context.so.1.91.0 \
libboost-filesystem.so.1.91.0 \
libboost-iostreams.so.1.91.0 \
libboost-program-options.so.1.91.0 \
libboost-thread.so.1.91.0 \
libc.so.6 \
libcrypto.so.3 \
libedit.so.0 \
libgcc-s.so.1 \
libm.so.6 \
libprotobuf-lite.so.36.1.0 \
libssl.so.3 \
libstdc++.so.6 \
libsystemd.so.0 \
systemd"

inherit rpm
