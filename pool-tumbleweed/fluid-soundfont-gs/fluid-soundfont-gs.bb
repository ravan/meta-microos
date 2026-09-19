SUMMARY = "Fluid (R3) General MIDI SoundFont (GS)"
DESCRIPTION = "This is a GS SoundFont, for use with any modern MIDI synthesiser: hardware \
(like the emu10k1 sound card), or software (like FluidSynth). \
 \
This package provides the smaller GS sound set of Roland Sound Canvas \
extensions."
LICENSE = "MIT"

PV = "3.1"

RPM_NAME = "fluid-soundfont-gs-3.1-5.24.noarch.rpm"
RPM_HASH = "fefc6b3201e04f34b091d8fbe9d5cbce50de726e748d6435449fef795b68d6cc7216894ee57af9c6fea6825aa83c2929a2eb517239b6f84bdf6e0e1823dca54a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-fluid-soundfont-gs \
fluid-soundfont-gs"

RDEPENDS:${PN} += "fluid-soundfont-gm"

inherit rpm
