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

RPM_NAME = "nuspell-5.1.7-1.4.aarch64.rpm"
RPM_HASH = "2cb2d111cc121789a0ca475d2dbaa435ab49df539ae81a8f408f8ddd726386088314b3d51c525ac1e8beb723b7d430b9f9263dcea48fc8104c10a04293681713"

RPROVIDES:${PN} += "nuspell"

RDEPENDS:${PN} += "hunspell \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libicuuc.so.78 \
libnuspell.so.5 \
libstdc++.so.6"

inherit rpm
