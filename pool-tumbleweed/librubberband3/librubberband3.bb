SUMMARY = "Audio time-stretching and pitch-shifting library"
DESCRIPTION = "Rubber Band is a library and utility program that permits you to change the \
tempo and pitch of an audio recording independently of one another."
LICENSE = "GPL-2.0-or-later"

PV = "4.0.0"

RPM_NAME = "librubberband3-4.0.0-1.6.aarch64.rpm"
RPM_HASH = "0ab86bd942b73280033716a9cb758f80b1da913c7b6768904cfc7393a72cb3aa29a05afa3c732be8107b56e697917b44b7ebd4cd2e539500078e543db4c12cca"

RPROVIDES:${PN} += "librubberband.so.3 \
librubberband3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
