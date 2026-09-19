SUMMARY = "Maxima compiled with clisp"
DESCRIPTION = "Maxima compiled with Common Lisp."
LICENSE = "GPL-2.0-or-later"

PV = "5.50.0"

RPM_NAME = "maxima-exec-clisp-5.50.0-2.2.aarch64.rpm"
RPM_HASH = "ef9f69e3a2b50849e0c551ea9e40dc06f4fd78a5d483b4d62b76fd44027a098a2e08cb22858d7b324bd5fc1a1f162ed378627451e2bf0ff409c05a9a3c22d1e5"

RPROVIDES:${PN} += "maxima-exec \
maxima-exec-clisp"

RDEPENDS:${PN} += "clisp \
libc.so.6 \
libffcall.so.0 \
libm.so.6 \
libreadline.so.8 \
libsigsegv.so.2 \
libtinfo.so.6"

inherit rpm
