SUMMARY = "Translations for package vorbis-tools"
DESCRIPTION = "Provides translations for the 'vorbis-tools' package."
LICENSE = "GPL-2.0-only"

PV = "1.4.3"

RPM_NAME = "vorbis-tools-lang-1.4.3-2.2.noarch.rpm"
RPM_HASH = "f3dadab5e624a0575c07a788202d01730e8c9773069107613e90006086854515454cb7b884103dc89d99d8c92cf716116607b8c9407758180c7c60bbf9dee63b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-vorbis-tools-be \
locale-vorbis-tools-cs \
locale-vorbis-tools-da \
locale-vorbis-tools-de \
locale-vorbis-tools-en-GB \
locale-vorbis-tools-eo \
locale-vorbis-tools-es \
locale-vorbis-tools-fr \
locale-vorbis-tools-hr \
locale-vorbis-tools-hu \
locale-vorbis-tools-id \
locale-vorbis-tools-ka \
locale-vorbis-tools-nb \
locale-vorbis-tools-nl \
locale-vorbis-tools-pl \
locale-vorbis-tools-ro \
locale-vorbis-tools-ru \
locale-vorbis-tools-sk \
locale-vorbis-tools-sl \
locale-vorbis-tools-sr \
locale-vorbis-tools-sv \
locale-vorbis-tools-uk \
locale-vorbis-tools-vi \
vorbis-tools-lang \
vorbis-tools-lang-all"

RDEPENDS:${PN} += "vorbis-tools"

inherit rpm
