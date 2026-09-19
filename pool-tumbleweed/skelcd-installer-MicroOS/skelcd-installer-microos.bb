SUMMARY = "installer and related files needed on dvd1"
DESCRIPTION = "This package contains kernel, initrd and installation images \
needed on the first product dvds to start an installation."
LICENSE = "GPL-2.0-or-later"

PV = "17.178"

RPM_NAME = "skelcd-installer-MicroOS-17.178-1.9.aarch64.rpm"
RPM_HASH = "c62fc6584055a2b61d2caed32e9c6e3b5e2f87a4f8c07202d95951459a6ed02f9e8fe198c4b466e70bd17d0c21afb13f1207e5b32786a17cc6e1c6a40fbc574b"

RPROVIDES:${PN} += "skelcd-installer \
skelcd-installer-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
