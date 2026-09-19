SUMMARY = "C++ library for filezilla"
DESCRIPTION = "libfilezilla is C++ library, offering some basic functionality to \
build high-performing, platform-independent programs. libfilezilla is \
needed for filezilla (an FTP client and server) to build. Some of the \
highlights include: \
 \
* A typesafe, multi-threaded event system. \
* Timers for periodic events. \
* A datetime class that not only tracks timestamp but also their accuracy, \
  which simplifies dealing with timestamps originating from different sources. \
* Simple process handling for spawning child processes with redirected I/O."
LICENSE = "GPL-2.0-or-later"

PV = "0.57.0"

RPM_NAME = "libfilezilla59-0.57.0-1.1.aarch64.rpm"
RPM_HASH = "c9a560dbce2d40733bc264dd1a663676b6040f25ad086ea58fedc54900f89e35da71d5e31a46fcfbc352b9d40ddcc21dbf658bdd6c0711c5e39911253423515d"

RPROVIDES:${PN} += "libfilezilla \
libfilezilla.so.59 \
libfilezilla59"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libgcc-s.so.1 \
libgmp.so.10 \
libgnutls.so.30 \
libhogweed.so.6 \
libnettle.so.8 \
libstdc++.so.6"

inherit rpm
