SUMMARY = "TOMOE GTK+ library"
DESCRIPTION = "TOMOE GTK+ library"
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.0"

RPM_NAME = "tomoe-gtk-0.6.0-45.6.aarch64.rpm"
RPM_HASH = "3925c100f4a79aaadb401759ec3513174b7d147a1128913f38c913007b480dbaab8b407a7bcf7f36b2cfe6bf6fbb0cb2f1162522b429a7884a1c90156706fb8d"

RPROVIDES:${PN} += "tomoe-gtk"

RDEPENDS:${PN} += "libtomoe-gtk0 \
tomoe-gtk-lang"

inherit rpm
