SUMMARY = "MooX::Options + MooX::Cmd + Sanity"
DESCRIPTION = "CLI::Osprey is a module to assist in writing commandline applications with \
M* OO modules (Moose, Moo, Mo). With it, you structure your app as one or \
more modules, which get instantiated with the commandline arguments as \
attributes. Arguments are parsed using Getopt::Long::Descriptive, and both \
long and short help messages as well as complete manual pages are \
automatically generated. An app can be a single command with options, or \
have sub-commands (like 'git'). Sub-commands can be defined as modules \
(with options of their own) or as simple coderefs."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.90.0"

RPM_NAME = "perl-CLI-Osprey-0.90.0-1.5.noarch.rpm"
RPM_HASH = "d4cd1843e6c3aca92dc202b9fac97b1d337de61632a84ba143408a922f864c4a058082dee814a0d23a45a2206a18ea357dddc051311b0d8f3cc36c0aae821661"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CLI--Osprey \
perl-CLI--Osprey--Descriptive \
perl-CLI--Osprey--Descriptive--Usage \
perl-CLI--Osprey--InlineSubcommand \
perl-CLI--Osprey--Role \
perl-CLI-Osprey"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Getopt--Long--Descriptive \
perl-Module--Runtime \
perl-Moo \
perl-Moo--Role \
perl-Path--Tiny"

inherit rpm
