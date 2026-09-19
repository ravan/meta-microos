SUMMARY = "A Library for Interfacing IEEE 1284-Compatible Devices"
DESCRIPTION = "This library is intended to be used by applications that need to \
communicate with (or at least identify) devices that are attached via a \
parallel port."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "0.2.11"

RPM_NAME = "libieee1284-3-0.2.11-2.10.aarch64.rpm"
RPM_HASH = "4df92037d327fcddb151a37321c168252bf59193e6aaca7a3154b7b53b4050693137374f6e0923588f9e925e7129c8fedb019ab28e4ee4297b7adfc1abd0d4e5"

RPROVIDES:${PN} += "libieee1284-3 \
libieee1284.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
