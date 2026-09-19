SUMMARY = "Perl bindings for libguestfs (Sys::Guestfs)"
DESCRIPTION = "perl-Sys-Guestfs contains Perl bindings for libguestfs (Sys::Guestfs)."
LICENSE = "GPL-2.0-or-later"

PV = "1.60.1"

RPM_NAME = "perl-Sys-Guestfs-1.60.1-1.1.aarch64.rpm"
RPM_HASH = "9c580d4b258a97fe08b133732134631081d9b00aeaff0fb4d517b0793a1a373c47f7449a7d3cc5f1a546cfc880e2bc32b5897647b66974feeb1b2178e7098f78"

RPROVIDES:${PN} += "perl-Sys--Guestfs \
perl-Sys-Guestfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libguestfs \
libguestfs.so.0 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
