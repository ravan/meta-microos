SUMMARY = "Explicit Options eXtension for Object Class"
DESCRIPTION = "Create a command line tool with your Moo, Moose objects. \
 \
Everything is explicit. You have an 'option' keyword to replace the usual \
'has' to explicitly use your attribute into the command line. \
 \
The 'option' keyword takes additional parameters and uses \
Getopt::Long::Descriptive to generate a command line tool."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "4.103"

RPM_NAME = "perl-MooX-Options-4.103-1.28.noarch.rpm"
RPM_HASH = "bbe25b9bf00ea16831ab644b4332622bbf2a38c79007be5266eec8d501d28bd0bb86fc0155d92beddbe7d4202a202ee0b7031d9de0d94cca931f8dce9afea66f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooX--Options \
perl-MooX--Options--Descriptive \
perl-MooX--Options--Descriptive--Usage \
perl-MooX--Options--Role \
perl-MooX-Options"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Getopt--Long \
perl-Getopt--Long--Descriptive \
perl-MRO--Compat \
perl-Module--Runtime \
perl-Moo \
perl-MooX--Locale--Passthrough \
perl-Path--Class \
perl-Text--LineFold \
perl-strictures"

inherit rpm
