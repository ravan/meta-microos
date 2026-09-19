SUMMARY = "The GCC Preprocessor"
DESCRIPTION = "This Package contains just the preprocessor that is used by the X11 \
packages."
LICENSE = "GPL-3.0-or-later"

PV = "14.4.0+git12698"

RPM_NAME = "cpp14-14.4.0+git12698-1.4.aarch64.rpm"
RPM_HASH = "e8080117b4424e90fd5105913162a0b93ab7eca2fcc45f44499dc45bc0e59b5ae76ee54dec8d7d220b42f5520dec8a493b24047398be66cd98e2a2e3b3ae7841"

RPROVIDES:${PN} += "cpp14"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
