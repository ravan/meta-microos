SUMMARY = "Music editor that matches the look and feel of Impulse Tracker"
DESCRIPTION = "Schism Tracker is a reimplementation of Impulse Tracker, a \
program used to create music without the requirements of \
specialized, expensive equipment, and with a unique 'finger feel' \
that is difficult to replicate in-part. The player is based on a \
modified version of the Modplug engine, with a number of \
bugfixes and changes to improve IT playback."
LICENSE = "GPL-2.0-or-later"

PV = "20260524"

RPM_NAME = "schismtracker-20260524-2.2.aarch64.rpm"
RPM_HASH = "4e6ba454cfb017cb77418d5090e73de5484d1e7cda07991d37b7dcf026cab14fa7b2d3e77cf770c05b380a4df9951a6c4eca45c4f73f4ff83b11340dd93bfd31"

RPROVIDES:${PN} += "schismtracker"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL3.so.0 \
libX11.so.6 \
libc.so.6 \
libm.so.6 \
libutf8proc.so.3"

inherit rpm
