SUMMARY = "Generate console fonts from BDF source fonts"
DESCRIPTION = "This package provides a command-line converter that can be used in \
scripts to build console fonts from BDF sources automatically. \
The converter comes with a collection of font encodings that cover \
many of the world's languages. The output font can use a different \
character encoding from the input. When the source font does not \
define a glyph for a particular symbol in the encoding table, that \
glyph position in the console font is not wasted but used for \
another symbol."
LICENSE = "GPL-2.0-or-later & MIT & SUSE-Public-Domain"

PV = "1.237"

RPM_NAME = "bdf2psf-1.237-2.4.noarch.rpm"
RPM_HASH = "e1d77d92461edd63ed13e815e831ac84ddbac4c14d8b86b17d359d85850357492553da7f0d31bc4495aadf83b1308c3175c2990c950bb949e8079cc3f5e542b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bdf2psf"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
