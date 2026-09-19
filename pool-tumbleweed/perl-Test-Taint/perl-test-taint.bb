SUMMARY = "Checks for taintedness of variables"
DESCRIPTION = "Tainted data is data that comes from an unsafe source, such as the command \
line, or, in the case of web apps, any GET or POST transactions. Read the \
perlsec man page for details on why tainted data is bad, and how to untaint \
the data. \
 \
When you're writing unit tests for code that deals with tainted data, \
you'll want to have a way to provide tainted data for your routines to \
handle, and easy ways to check and report on the taintedness of your data, \
in standard Test::More style."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.80.0"

RPM_NAME = "perl-Test-Taint-1.80.0-1.7.aarch64.rpm"
RPM_HASH = "364ab67e11d69d8d34bdf74af9fa01d1b928ca9079b61dc63959dfaf5bc5f17b5e08d9b4517cea6e1c029fad79a1cd7c1c7a5b6b48bb12206452252e9dfa6621"

RPROVIDES:${PN} += "perl-Test--Taint \
perl-Test-Taint"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
