SUMMARY = "The GNU Parser Generator"
DESCRIPTION = "Bison is a parser generator similar to yacc(1)."
LICENSE = "GPL-3.0-or-later"

PV = "3.8.2"

RPM_NAME = "bison-3.8.2-4.1.aarch64.rpm"
RPM_HASH = "a59be795c02a13f748dfa1a7ac0d4bd87cd8ab6b54920ca63956fff9c4a53296c853f2135e3a7bb7a0a7608d2489a355826bba87292d6509875436876fc255a7"

RPROVIDES:${PN} += "bison"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
m4"

inherit rpm
