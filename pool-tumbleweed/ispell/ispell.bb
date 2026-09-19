SUMMARY = "A Spell Checker"
DESCRIPTION = "Ispell is a fast, screen-oriented spell checker that shows you your \
errors in the context of the original file and suggests possible \
corrections when it can figure them out.  Compared to UNIX spell, it is \
faster and much easier to use.	Ispell can also handle languages other \
than English.  Ispell has a long history and many people have \
contributed to the current version--some of the major contributors \
include R. E. Gorin, Pace Willisson, Walt Buehring, and Geoff Kuenning. \
 \
You can find a short description in the directory \
/usr/share/doc/packages/ispell/. \
 \
 \
 \
Authors: \
-------- \
    R. E. Gorin \
    Pace Willisson <pace@ai.mit.edu> \
    Walt Buehring \
    Goeff Kuenning <geoff@ITcorp.com>"
LICENSE = "BSD-3-Clause"

PV = "3.4.06"

RPM_NAME = "ispell-3.4.06-5.1.aarch64.rpm"
RPM_HASH = "ff85132aae7d5b25eb52b6ffa4ddab0095fe5b95e9814469f9702379577f9da4e66a41fa513a8acbb75093d47345cc7a3f62b427944fff14581dcab3c6b5aa32"

RPROVIDES:${PN} += "ispell \
spell"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ispell-dictionary \
ispell-english-dictionary \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6 \
words"

inherit rpm
