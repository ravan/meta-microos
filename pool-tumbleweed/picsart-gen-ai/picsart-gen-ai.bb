SUMMARY = "Picsart AI CLI for generating images, video and audio"
DESCRIPTION = "gen-ai is Picsart's command line client for their generative AI service. It \
generates and edits images, video and audio from the terminal, with an \
interactive picker for models and parameters, batch re-runs of failed jobs and \
a browsable history of previous generations. \
 \
Using it requires a Picsart account: the CLI is a client for a hosted API and \
performs no generation locally."
LICENSE = "MIT & ISC & Apache-2.0 & BlueOak-1.0.0"

PV = "2.76.0"

RPM_NAME = "picsart-gen-ai-2.76.0-1.1.noarch.rpm"
RPM_HASH = "bc728bce5a61c71894754a84a1cf9c41c278315f3577b16a2da37b1102655bba12c4cf568e3aef449b745fe111ec9ff481bea3ac30092c2fe8dd66ee9d807225"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "picsart-gen-ai"

RDEPENDS:${PN} += "/usr/bin/node \
nodejs"

inherit rpm
