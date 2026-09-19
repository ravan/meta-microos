SUMMARY = "Translations for package scidavis"
DESCRIPTION = "Provides translations for the 'scidavis' package."
LICENSE = "GPL-2.0-only & GPL-3.0-or-later"

PV = "2.9.0"

RPM_NAME = "scidavis-lang-2.9.0-4.4.noarch.rpm"
RPM_HASH = "b1ce5c723efd883ad4d332a7050202ec620755851f4fd271a9d6a10ce857c5f3eb9ac57eeb283ebef867e6b8618f73373fcd2f32a1ddbe6bb7edcd878968c658"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "scidavis-lang \
scidavis-lang-all"

RDEPENDS:${PN} += "scidavis"

inherit rpm
