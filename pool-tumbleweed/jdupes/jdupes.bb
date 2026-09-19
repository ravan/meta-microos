SUMMARY = "A powerful duplicate file finder and an enhanced fork of 'fdupes'"
DESCRIPTION = "A program for identifying and taking actions upon duplicate files. \
 \
A WORD OF WARNING: jdupes IS NOT a drop-in compatible replacement for fdupes! \
Do not blindly replace fdupes with jdupes in scripts and expect everything to \
work the same way. Option availability and meanings differ between the two \
programs."
LICENSE = "MIT"

PV = "1.30.0"

RPM_NAME = "jdupes-1.30.0-1.6.aarch64.rpm"
RPM_HASH = "3ab3447983dc385fbc1f7f0931d64f562a2e13bb02c51c753bc66a68d856648aaf0218e9ed9539df4d050077e68405ee98344e9f28322a40a327ccabdf62878b"

RPROVIDES:${PN} += "jdupes \
rpm-macro-fdupes \
rpm-macro-suse-hardlink-dupes \
rpm-macro-suse-symlink-dupes"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libjodycode.so.4 \
libstdc++.so.6"

inherit rpm
