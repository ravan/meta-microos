SUMMARY = "Language files for package gtypist"
DESCRIPTION = "GNU Typist (typist) is a universal typing tutor. You can learn \
correct typing and improve your skills by practising its exercises on \
a regular basis. \
 \
This subpackage contain the translations for the package gtypist."
LICENSE = "GPL-3.0-or-later"

PV = "2.10.1"

RPM_NAME = "gtypist-lang-2.10.1-1.5.aarch64.rpm"
RPM_HASH = "c7042523e18b6d0a2d05dc5f96572b15287cd1173f1cd1ceaa19bd500d8126b55304f32663c87ebd8d39c1ce251fd4b26d430b8d9c150f6cc76d3c2959562c78"

RPROVIDES:${PN} += "gtypist-lang \
locale-gtypist-cs \
locale-gtypist-de \
locale-gtypist-es \
locale-gtypist-eu \
locale-gtypist-fi \
locale-gtypist-fr \
locale-gtypist-nl \
locale-gtypist-pl \
locale-gtypist-ro \
locale-gtypist-ru \
locale-gtypist-tr \
locale-gtypist-zh-CN \
locale-gtypist-zh-TW"

RDEPENDS:${PN} += "gtypist"

inherit rpm
