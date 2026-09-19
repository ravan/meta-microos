SUMMARY = "Soundfont and MIDI Sample"
DESCRIPTION = "This package contains the following sound fonts: Vintage Dreams Waves v \
2.0. by Ian Wilson and GeneralUser 1.1 by Samuel Collins. Vintage \
Dreams Waves features 128 analog synthesizer patches and 8 drum kits. \
The sound font can be used with Sound Blaster AWE and SB Live! sound \
cards. The package also provides a sample MIDI file for this sound \
font. The ROM sound font GeneralUser 1.1 only works with SB AWE \
soundcards. It is General MIDI compatible."
LICENSE = "SUSE-Freeware"

PV = "0.1.2"

RPM_NAME = "snd_sf2-0.1.2-682.7.noarch.rpm"
RPM_HASH = "06ec21092553b25a712520b5206dd4aaff4eb7b0d9498ff9b7d4218784914be2f5f80b285effb8e3e3532578a26ad15ba89df9e84bc7f2e414484ab8049ea66e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "snd-sf2 \
soundfont"

RDEPENDS:${PN} += "awesfx"

inherit rpm
