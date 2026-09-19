SUMMARY = "A Command Line MIDI Player for ALSA"
DESCRIPTION = "pmidi is a command line MIDI player for ALSA."
LICENSE = "GPL-2.0-only"

PV = "1.7.1"

RPM_NAME = "pmidi-1.7.1-1.22.aarch64.rpm"
RPM_HASH = "aeb91851b39508d1ce40134454742274e46e87606a852895fcf778897f72a1b9593701085327a397700f13ccb16fdbd297ff100640fe19a458b6f401141ea1fd"

RPROVIDES:${PN} += "pmidi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6"

inherit rpm
