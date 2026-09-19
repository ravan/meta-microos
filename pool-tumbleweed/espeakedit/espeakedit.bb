SUMMARY = "Software speech synthesizer (text-to-speech)"
DESCRIPTION = "eSpeak is a software speech synthesizer for English, and some other languages. \
eSpeakEdit provides a User Interface to edit the eSpeak voices."
LICENSE = "GPL-3.0+"

PV = "1.48.03"

RPM_NAME = "espeakedit-1.48.03-3.12.aarch64.rpm"
RPM_HASH = "90f5e7b10a3c67d10636c185e9f4972f40330c2910b5a87e0943689e6867dbce7e1c4e7ea76e3581753d09bdf6e4d9784fef998f2f354accf01b178c57effcce"

RPROVIDES:${PN} += "espeakedit"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6 \
libportaudio.so.2 \
libstdc++.so.6 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk2u-core-suse.so.16.0.0 \
libwx-gtk2u-html-suse.so.16.0.0"

inherit rpm
