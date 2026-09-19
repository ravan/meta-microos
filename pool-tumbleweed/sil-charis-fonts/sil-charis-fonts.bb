SUMMARY = "Smart Unicode Font for Latin and Cyrillic Scripts"
DESCRIPTION = "Charis is similar to Bitstream Charter, one of the first fonts designed \
specifically for laser printers. It is highly readable and holds up \
well in less-than-ideal reproduction environments. It also has a full \
set of styles - regular, italic, bold, bold italic - and so is more \
useful in general publishing than Doulos SIL. Charis is a serif, \
proportionally-spaced font optimized for readability in long printed \
documents. \
 \
The goal for this product was to provide a single Unicode-based font \
family that would contain a comprehensive inventory of glyphs needed \
for almost any Roman- or Cyrillic-based writing system, whether used \
for phonetic or orthographic needs. In addition, there is provision for \
other characters and symbols useful to linguists. This font makes use \
of state-of-the-art font technologies to support complex typographic \
issues, such as the need to position arbitrary combinations of base \
glyphs and diacritics optimally."
LICENSE = "OFL-1.1"

PV = "7.000"

RPM_NAME = "sil-charis-fonts-7.000-1.4.noarch.rpm"
RPM_HASH = "5c50b086cef14b060596e9b176b15126c9499a951b5d82f623996cf9b4a7e9fced00632243b3c44f021f695d11fc4493a0dee65df80f25609dd3c07f2d54c4c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-vi;ru;bg \
sil-charis-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
