SUMMARY = "A spell checker library and command-line tool"
DESCRIPTION = "Nuspell is a spell checker written in C++. It supports languages with \
rich morphology and complex word compounding. \
 \
Main features are: \
 - Full unicode support backed by ICU \
 - Backward compatibility with Hunspell dictionary file format \
 - Twofold affix stripping (for agglutinative languages, like Azeri, \
   Basque, Estonian, Finnish, Hungarian, Turkish, etc.) \
 - Support complex compounds (for example, Hungarian, Germand and Dutch) \
 - Support language specific features (for example, special casing of \
   Azeri and Turkish dotted i, or German sharp s) \
 - Handle conditional affixes, circumfixes, fogemorphemes, forbidden \
   words, pseudoroots and homonyms."
LICENSE = "LGPL-3.0-or-later"

PV = "5.1.7"

RPM_NAME = "libnuspell5-5.1.7-1.4.aarch64.rpm"
RPM_HASH = "4cf42144f3a55da353fc0b1fc13ccb32891f27c62d54895c53388c2d338683abbab061cc0069bf612eab79f06d2dc0ba2c0d5d32bea522e79772e0d5c4842e97"

RPROVIDES:${PN} += "libnuspell.so.5 \
libnuspell5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libicuuc.so.78 \
libstdc++.so.6"

inherit rpm
