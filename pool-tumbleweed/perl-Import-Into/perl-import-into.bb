SUMMARY = "Import packages into other packages"
DESCRIPTION = "Writing exporters is a pain. Some use the Exporter manpage, some use the \
Sub::Exporter manpage, some use the Moose::Exporter manpage, some use the \
Exporter::Declare manpage ... and some things are pragmas. \
 \
Exporting on someone else's behalf is harder. The exporters don't provide a \
consistent API for this, and pragmas need to have their import method \
called directly, since they effect the current unit of compilation. \
 \
'Import::Into' provides global methods to make this painless."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.002005"

RPM_NAME = "perl-Import-Into-1.002005-1.40.noarch.rpm"
RPM_HASH = "abc81aa4830bbffdd9ba5f7488c7624283e3f57df6ebfa7dfacca630e82d1f3ae6db3defe7b270695a4fbc3f0b462938a70ee02fc4154d33a5399df7433e81b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Import--Into \
perl-Import-Into"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Module--Runtime"

inherit rpm
