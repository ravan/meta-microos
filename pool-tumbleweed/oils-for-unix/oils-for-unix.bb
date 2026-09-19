SUMMARY = "A bash compatible shell and a new modern shell"
DESCRIPTION = "oils-for-unix contains two different shells: a POSIX and bash compatible shell \
called OSH, and a modern Python-like shell called YSH."
LICENSE = "Apache-2.0 & CNRI-Python-GPL-Compatible"

PV = "0.37.0"

RPM_NAME = "oils-for-unix-0.37.0-1.4.aarch64.rpm"
RPM_HASH = "9e9707659daba09e43ac40542b9aa69c71150d67513c157c7f270615c1cfc781be53ced45f3abc5008bf7c2fd3a6b70faf8bfad47bf6097f7a47d0fb535f3c4e"

RPROVIDES:${PN} += "oils-for-unix"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libreadline.so.8 \
libstdc++.so.6"

inherit rpm
