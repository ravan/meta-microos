SUMMARY = "Concise attribute rewriting"
DESCRIPTION = "'HTML::RewriteAttributes' is designed for simple yet powerful HTML \
attribute rewriting. \
 \
You simply specify a callback to run for each attribute and we do the rest \
for you. \
 \
This module is designed to be subclassable to make handling special cases \
easier. See the source for methods you can override. \
 \
See the SYNOPSIS above and included tests in the 't' directory for more \
examples."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.60.0"

RPM_NAME = "perl-HTML-RewriteAttributes-0.60.0-1.10.noarch.rpm"
RPM_HASH = "f31e92415ed941ebe457a081c632601d0cd24e376ed0e7e7e234aa319f52212abb33c41c22df9f896906e336c8f449ee7f5265ba6912e3605fb9bc6e89b265d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTML--RewriteAttributes \
perl-HTML--RewriteAttributes--Links \
perl-HTML--RewriteAttributes--Resources \
perl-HTML-RewriteAttributes"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-HTML--Entities \
perl-HTML--Parser \
perl-HTML--Tagset \
perl-URI"

inherit rpm
