SUMMARY = "Translations for package gnome-devel-docs"
DESCRIPTION = "Provides translations for the 'gnome-devel-docs' package."
LICENSE = "CC-BY-SA-4.0 & GFDL-1.1-only"

PV = "40.3"

RPM_NAME = "gnome-devel-docs-lang-40.3-1.15.noarch.rpm"
RPM_HASH = "da7b57c616589de90744a724e785e9194fe7260b8f85d0b9bf3203efca5d5ccd84d3d17d056502dbf897eac23650d604c34f0dd3bc66fd738dc17be5853db90d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-devel-docs-lang \
gnome-devel-docs-lang-all"

RDEPENDS:${PN} += "gnome-devel-docs"

inherit rpm
