SUMMARY = "Kalpa branding for GRUB2"
DESCRIPTION = "Kalpa Desktop branding for the GRUB2 graphical console"
LICENSE = "CC-BY-SA-3.0"

PV = "1.0"

RPM_NAME = "grub2-branding-kalpa-1.0-1.2.noarch.rpm"
RPM_HASH = "4a7f94f808195100891b81c7fbec65b3aa7f80f4be3a9c89dc42f09a0177afd845fe10c909017170653b393f67f67a3375e3b3d5957856b965ac2a2eb099bcfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grub2-branding \
grub2-branding-kalpa"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh"

inherit rpm
