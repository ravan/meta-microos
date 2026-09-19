SUMMARY = "The GNU Compiler Collection targeting rx"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting rx. \
 \
 \
 \
 \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-rx-gcc7-bootstrap-7.5.0+r278197-24.3.aarch64.rpm"
RPM_HASH = "80f8d44329516fd570479929f959a5ef8dbc88ae764f657c436038c92f87f76afc2375d183dec1d554a1c364ba26df8c382de7bd704808462120e2cf70b21a79"

RPROVIDES:${PN} += "cross-rx-gcc7-bootstrap \
liblto-plugin.so.0 \
rx-elf-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-rx-binutils \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm
