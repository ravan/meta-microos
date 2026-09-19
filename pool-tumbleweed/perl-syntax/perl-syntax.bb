SUMMARY = "Activate syntax extensions"
DESCRIPTION = "This module activates community provided syntax extensions to Perl. You \
pass it a feature name, and optionally a scalar with arguments, and the \
dispatching system will load and install the extension in your package. \
 \
The import arguments are parsed with the Data::OptList manpage. There are \
no standardised options. Please consult the documentation for the specific \
syntax feature to find out about possible configuration options. \
 \
The passed in feature names are simply transformed: 'function' becomes the \
Syntax::Feature::Function manpage and 'foo_bar' would become \
'Syntax::Feature::FooBar'."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.004"

RPM_NAME = "perl-syntax-0.004-5.41.noarch.rpm"
RPM_HASH = "b8c60fb6e25f83daffb2ce7404ae075f08dac23f52ecf40ae3dbc7a84f81b585a837c09233e34c878472fd003c05bb67592655317a66beaefa1a2280dbaa9168"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-syntax"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Data--OptList \
perl-namespace--clean"

inherit rpm
