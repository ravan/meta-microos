SUMMARY = "Not so Common Desktop Environment (NsCDE)"
DESCRIPTION = "Visually, NsCDE mimics CDE, the well known Common Desktop Environment of \
many commercial UNIX systems of the nineties. It supports CDE backdrops and \
palettes with FVWM colorsets and has a theme generator for Xt, Xaw, Motif, \
GTK2, GTK3, Qt4 and Qt5. \
 \
Integrating all these bits and pieces, the user gets a retro visual experience \
across almost all X11 applications. Enriched with a bunch of powerful \
FVWM concepts and functions, modern applications and font rendering, \
NsCDE acts as a link between classic CDE look and a fast and \
extensible environment, well suited for modern day computing."
LICENSE = "GPL-3.0-only"

PV = "2.3"

RPM_NAME = "NsCDE-2.3-1.8.aarch64.rpm"
RPM_HASH = "52d7a41efbf65a822c2fb5b9181c04a328a8664c0c7a135521003fad9a1c3beced3f2e6effd9d0bd138fad41dbc5829ec8d0ea783317a89122912a479e36a261"

RPROVIDES:${PN} += "NsCDE \
config-NsCDE"

RDEPENDS:${PN} += "/usr/bin/ksh93 \
/usr/bin/python3 \
fvwm2 \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXpm.so.4 \
libc.so.6 \
libm.so.6"

inherit rpm
