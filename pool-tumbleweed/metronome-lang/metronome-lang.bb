SUMMARY = "Translations for package metronome"
DESCRIPTION = "Provides translations for the 'metronome' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.0"

RPM_NAME = "metronome-lang-1.0.0-2.9.noarch.rpm"
RPM_HASH = "6405df844328b93c9c4353df95baddac036fb152316a58622e4293607eb2dde8e3b58f6509307129017d4345d572ee99a6a3267352d3cf421caa4fc9c4ce8c55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-metronome-de \
locale-metronome-fr \
locale-metronome-lt \
locale-metronome-nl \
metronome-lang \
metronome-lang-all"

RDEPENDS:${PN} += "metronome"

inherit rpm
