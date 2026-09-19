SUMMARY = "Common Access Card (CAC) emulation -- Development files"
DESCRIPTION = "This emulator is designed to provide emulation of actual smart cards to a \
virtual card reader running in a guest virtual machine. The emulated smart \
cards can be representations of real smart cards, where the necessary functions \
such as signing, card removal/insertion, etc. are mapped to real, physical \
cards which are shared with the client machine the emulator is running on, or \
the cards could be pure software constructs. \
 \
This sub-package contains development files for the Smartcard library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.8.2"

RPM_NAME = "libcacard-devel-2.8.2-1.3.aarch64.rpm"
RPM_HASH = "2bdcc361557198d797da797cbbd8f16d35bcde446684718eb3c99353d0e3a5afb7c1396d89a60511bd28a9749ec35aaeeea210363ed8156a64f1223b47b75436"

RPROVIDES:${PN} += "libcacard-devel \
pkgconfig-libcacard"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glib2-devel \
libcacard0 \
mozilla-nspr \
mozilla-nss \
pkgconfig-glib-2.0 \
pkgconfig-nss"

inherit rpm
