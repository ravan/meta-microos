SUMMARY = "Daemon for the libguestfs appliance"
DESCRIPTION = "guestfsd runs within the libguestfs appliance. It receives commands from the host \
and performs the requested action by calling the helper binaries. \
This package is only required for building the appliance."
LICENSE = "GPL-2.0-or-later"

PV = "1.60.1"

RPM_NAME = "libguestfsd-1.60.1-1.1.aarch64.rpm"
RPM_HASH = "67225bc2171034e95b191339b88a1790e45187dac139f0ea185d928ff1e99ce4fce6a5d01534e8888b086dda17f4dfa645b0a0e8372975f87e43218334233e8a"

RPROVIDES:${PN} += "guestfsd \
libguestfsd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libacl.so.1 \
libaugeas.so.0 \
libc.so.6 \
libcap.so.2 \
libhivex.so.0 \
libjson-c.so.5 \
libm.so.6 \
libpcre2-8.so.0 \
librpm.so.10 \
libselinux.so.1 \
libtirpc.so.3"

inherit rpm
