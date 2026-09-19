SUMMARY = "Fluid (R3) General MIDI SoundFont (GM)"
DESCRIPTION = "This is a GM SoundFont, for use with any modern MIDI synthesiser: hardware \
(like the emu10k1 sound card), or software (like FluidSynth). \
 \
This package provides the larger GM sound set, without the Roland Sound \
Canvas extensions."
LICENSE = "MIT"

PV = "3.1"

RPM_NAME = "fluid-soundfont-gm-3.1-5.24.noarch.rpm"
RPM_HASH = "3b4fee172f59b6d3b419f8e2421d22c6ff451dbab4a6ec15378dc5ad27a318513075445eeb2745f059edfe464a4d2268ce780d05a8287381fa74e89255b0fabc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-fluid-soundfont-gm \
fluid-soundfont-gm"

RDEPENDS:${PN} += ""

inherit rpm
