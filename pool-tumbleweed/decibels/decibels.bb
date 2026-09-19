SUMMARY = "Play audio files with a waveform"
DESCRIPTION = "App that lets you play audio files. \
It has a modern and adaptive interface, with a waveform, simple playback controls, \
and the ability to control the speed at which the audio is played."
LICENSE = "GPL-3.0-or-later"

PV = "49.6.1"

RPM_NAME = "decibels-49.6.1-1.2.noarch.rpm"
RPM_HASH = "3ef61bab583c3f8ee6bc902ea524644f91f9ea51e454df8413ae61634ca5f14197d77b194a484e0453019078cb1d7becf1b0b2106474bd5c000e866f840eee10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bundled-gi-types \
decibels"

RDEPENDS:${PN} += "typelib-GstPlay"

inherit rpm
