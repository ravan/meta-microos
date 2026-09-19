SUMMARY = "ANSI Terminal Escape Code Converter"
DESCRIPTION = "Ansifilter handles text files containing ANSI terminal escape codes.  The \
command sequences may be stripped or be interpreted to generate formatted \
output (HTML, RTF, TeX, LaTeX, BBCode)."
LICENSE = "GPL-3.0-or-later"

PV = "2.23"

RPM_NAME = "ansifilter-2.23-1.1.aarch64.rpm"
RPM_HASH = "6465d4e9989cbcd64a2f36305c7912c1f2713b073578f29d82e165578951f016a08d57b38a84f2a4d90dc2e412343a76363dea61e86307d9b059e72fb3ad6394"

RPROVIDES:${PN} += "ansifilter \
ansifilter-bash-completion \
ansifilter-fish-completion \
ansifilter-zsh-completion"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
