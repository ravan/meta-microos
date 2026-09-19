SUMMARY = "A data font of 7440 Egyptian hieroglyphs"
DESCRIPTION = "Font containing 7440 Egyptian hieroglyphs. \
Abydos is mainly based on Glyph for Windows version 2.0; it also covers \
proposals for encoding Egyptian Hieroglyphs in The Unicode Standard: \
  * Hans van den Berg, Eric Aubourg, “Hieroglyphic Text Processing: \
    Glyph for Windows”, CCER, 2007 \
  * Michel Suignard, “Source analysis of an extended Egyptian \
    Hieroglyphs repertoire”, L2/16-257, \
  * “New draft for the encoding of an extended Egyptian Hieroglyphs \
    repertoire”, L2/17-073"
LICENSE = "SUSE-Permissive"

PV = "1.96"

RPM_NAME = "gdouros-abydos-fonts-1.96-2.15.noarch.rpm"
RPM_HASH = "e92bb0d5f56698113520499b9194025fcd102116dd6d1371fab3ee0aa4422656c623a6f5f4421338bdef95e7a9eb3fdce734d95f534a6921fbf33df085364d1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gdouros-abydos-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
