SUMMARY = "Translations for package ksnip"
DESCRIPTION = "Provides translations for the 'ksnip' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.1"

RPM_NAME = "ksnip-lang-1.10.1-3.7.noarch.rpm"
RPM_HASH = "1581da51a3aada484aa098df5fc747085d73dad10190542ed6e660bf38f633147d67d53960dc55629c6a0e15436ff371cb8eced21ff4a6f1080ce1b25bb56d2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ksnip-lang \
ksnip-lang-all"

RDEPENDS:${PN} += "ksnip"

inherit rpm
