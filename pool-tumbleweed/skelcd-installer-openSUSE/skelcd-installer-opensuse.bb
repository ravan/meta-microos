SUMMARY = "installer and related files needed on dvd1"
DESCRIPTION = "This package contains kernel, initrd and installation images \
needed on the first product dvds to start an installation."
LICENSE = "GPL-2.0-or-later"

PV = "17.178"

RPM_NAME = "skelcd-installer-openSUSE-17.178-1.9.aarch64.rpm"
RPM_HASH = "d91f124e6288432b783eaae39bb14ce223b0dfc1a76ef653311a7a7555c6ab3a2cb907d59b5c832440d9e0340e3991da38348bf91a0d1ece03fb75ac7418cd4a"

RPROVIDES:${PN} += "skelcd-installer \
skelcd-installer-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
