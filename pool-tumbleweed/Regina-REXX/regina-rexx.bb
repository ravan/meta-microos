SUMMARY = "Mark Hessling's implementation of the REXX Interpreter"
DESCRIPTION = "Mark Hessling's implementation of the REXX language interpreter."
LICENSE = "GFDL-1.1-only & LGPL-2.1-or-later"

PV = "3.9.7"

RPM_NAME = "Regina-REXX-3.9.7-1.1.aarch64.rpm"
RPM_HASH = "7eff06fec16a711f9954f1b489999f0b897469a5517f1e0bfe4097d90cb3e9c5f340899f0bcdf35bff8762bc589b686c38caf6c3e1eca19bfac9827f0fc2d485"

RPROVIDES:${PN} += "Regina-REXX \
config-Regina-REXX \
rexx"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libregina.so.3"

inherit rpm
