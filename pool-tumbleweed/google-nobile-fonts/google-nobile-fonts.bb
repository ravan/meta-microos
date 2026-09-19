SUMMARY = "Sans Serif Font"
DESCRIPTION = "'Nobile' is designed to work with the technologies of digital \
screens and handheld devices without losing the distinctive look \
more usually found in fonts designed for printing. Going back to \
William Morris's baseline 'Have nothing in your house that you do \
not know to be useful, or believe to be beautiful', the aim was to \
design a font that could function well, have good legibility on \
screen yet also be good loooking, not only at larger display sizes \
but also right down to small text sizes. \
 \
Designer: Vernon Adams"
LICENSE = "OFL-1.1"

PV = "1.0.38"

RPM_NAME = "google-nobile-fonts-1.0.38-11.25.noarch.rpm"
RPM_HASH = "755fa7a87f6bbc0692a8707a287e84d21f7742ed429e128337e643244e5e30e5050bf63231ffae662e376ef45f0477e426b37d5f437a7de55371a9f68cdebfd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-nobile-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
