SUMMARY = "Perl frontend to kakasi"
DESCRIPTION = "This module provides interface to kakasi (kanji kana simple inverter). \
kakasi is a set of programs and libraries which does what Japanese input \
methods do in reverse order. You feed Japanese and kakasi converts it to \
phonetic representation thereof. kakasi can also be used to tokenizing \
Japanese text. To find more about kakasi, see http://kakasi.namazu.org/ . \
 \
Text::Kakasi now features both functional and object-oriented APIs. \
functional APIs are 100% compatible with ver. 1.05. But to take advantage \
of 'Perl 5.8 Features', you should use OOP APIs instead. \
 \
See Text::Kakasi::JP for the Japanese version of this document."
LICENSE = "GPL-2.0-or-later"

PV = "2.04"

RPM_NAME = "perl-Text-Kakasi-2.04-165.7.aarch64.rpm"
RPM_HASH = "4ac5c7b50a09d10367f274bda4d066ddd9575b87e1d99420b7fbd0f4c0b60423a8d8738df1adaa6e35abfd894e5c78a8c3eed0aef7bad0176f792f9e2b8a47e2"

RPROVIDES:${PN} += "perl-Text--Kakasi \
perl-Text-Kakasi"

RDEPENDS:${PN} += "kakasi \
libc.so.6 \
libkakasi.so.2 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
