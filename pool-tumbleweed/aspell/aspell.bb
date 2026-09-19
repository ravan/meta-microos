SUMMARY = "A Spell Checker"
DESCRIPTION = "GNU Aspell is a spell checker planned to eventually replace Ispell. It \
can be used as a library or as an independent spell checker. \
 \
Its main feature is an improved method for finding possible \
suggestions for the English language, arguably surpassing Ispell and \
Microsoft Word. It also has many other technical enhancements over \
Ispell, such as using shared memory for dictionaries and \
intelligently handling personal dictionaries when more than one \
Aspell process is open at once."
LICENSE = "GFDL-1.1-or-later & LGPL-2.1-only & HPND & SUSE-BSD-Mark-Modifications"

PV = "0.60.8.2"

RPM_NAME = "aspell-0.60.8.2-1.3.aarch64.rpm"
RPM_HASH = "5a5a39a058ef8716a2ac7f79722aa53604f05dc3a573daa6998ba0cd92ed13b3b4c454a3b7c8da9336eae0158ce70db61bf0ae5bb1b5e3e1cdf966c28fcb973f"

RPROVIDES:${PN} += "aspell \
pspell"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
info \
ld-linux-aarch64.so.1 \
libaspell.so.15 \
libc.so.6 \
libncursesw.so.6 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
