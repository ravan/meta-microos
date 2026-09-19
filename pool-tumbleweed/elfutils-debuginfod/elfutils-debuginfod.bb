SUMMARY = "Debuginfod server provided by elfutils"
DESCRIPTION = "The elfutils-debuginfod package contains the debuginfod binary \
and control files for a service that can provide ELF/DWARF \
files to remote clients, based on build-id identification. \
The ELF/DWARF file searching functions in libdwfl can query \
such servers to download those files on demand."
LICENSE = "GPL-3.0-or-later"

PV = "0.194"

RPM_NAME = "elfutils-debuginfod-0.194-1.2.aarch64.rpm"
RPM_HASH = "ac7942b6efa38c8973e64c7f1eb1aa4f02ab67cb917a4fedaa9506eb488f8847487b8ff7c60a43a658990d1fcc818591b7d453fe2283c45faed40fc7695b269f"

RPROVIDES:${PN} += "elfutils-debuginfod \
group-debuginfod \
user-debuginfod"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
debuginfod-client \
elfutils \
fillup \
ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libdebuginfod.so.1 \
libdw.so.1 \
libelf.so.1 \
libgcc-s.so.1 \
libjson-c.so.5 \
liblzma.so.5 \
libm.so.6 \
libmicrohttpd.so.12 \
libsqlite3.so.0 \
libstdc++.so.6 \
sysuser-shadow"

inherit rpm
