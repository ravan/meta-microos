SUMMARY = "Filter to Convert Kanji Characters to Hiragana, Katakana, or Romaji"
DESCRIPTION = "KAKASI is the language processing filter to convert Kanji characters to \
Hiragana, Katakana, or Romaji(1) and may be helpful for reading \
Japanese documents. The word-splitting patch is merged from version \
2.3.0. \
 \
The name 'KAKASI' is the abbreviation of 'kanji kana simple inverter' \
and the inverse of SKK 'simple kana kanji converter' developed by \
Masahiko Sato at Tohoku University. Most entries of the kakasi \
dictionary are derived from the SKK dictionaries. If interested  in the \
naming of KAKASI, consult a Japanese-English dictionary. \
 \
(1) 'Romaji' is an alphabetical description of Japanese pronunciation."
LICENSE = "GPL-2.0-or-later"

PV = "2.3.6"

RPM_NAME = "kakasi-2.3.6-9.6.aarch64.rpm"
RPM_HASH = "a368d8431e173ab6ab05deffa2756ff37522fd579856f529547854d812d009670ddb8e6b5cc44e6d46cc531b12e6bf3acb8711b53105b6d06f0e70863b4cac20"

RPROVIDES:${PN} += "kakasi \
libkakasi.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
kakasi-dict \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
