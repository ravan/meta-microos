SUMMARY = "Kana-Kanji Conversion Engine"
DESCRIPTION = "Anthy is a package for an input method editor backend for Unix-like \
systems for the Japanese language. It can convert Hiragana to Kanji \
as per the language rules. As a preconversion stage, Latin characters \
(Romaji) can be used to input Hiragana. Anthy is commonly used with \
an input method framework such as ibus, fcitx or SCIM."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "9100h"

RPM_NAME = "anthy-9100h-42.12.aarch64.rpm"
RPM_HASH = "3fe672d41b4b8f4e40d7034711bab470269be12302b5737d4ef7134a8b68353c6497cdde23b891f7ee4bd843d74855cdbac6bb724641f09906608370efe343b8"

RPROVIDES:${PN} += "anthy \
config-anthy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libanthy.so.0 \
libanthydic.so.0 \
libanthyinput.so.0 \
libc.so.6"

inherit rpm
