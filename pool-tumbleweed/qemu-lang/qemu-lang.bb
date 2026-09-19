SUMMARY = "Translations for package qemu"
DESCRIPTION = "Provides translations for the 'qemu' package."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "11.1.1"

RPM_NAME = "qemu-lang-11.1.1-1.1.noarch.rpm"
RPM_HASH = "c79786388360537c50cad85c83c6129149635cf500d256032f630b98553a7c5c1838ea563fc30b1a053a05414fee3b71ae0c7e97fddef7cd2a8f36afddfeca13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-qemu-bg \
locale-qemu-de-DE \
locale-qemu-fr-FR \
locale-qemu-hu \
locale-qemu-it \
locale-qemu-sv \
locale-qemu-tr \
locale-qemu-uk \
locale-qemu-zh-CN \
qemu-lang \
qemu-lang-all"

RDEPENDS:${PN} += "qemu"

inherit rpm
