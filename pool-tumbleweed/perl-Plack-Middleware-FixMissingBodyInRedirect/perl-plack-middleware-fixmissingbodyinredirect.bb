SUMMARY = "Plack::Middleware which sets body for redirect response, if it's not alr[cut]"
DESCRIPTION = "This module sets body in redirect response, if it's not already set."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.12"

RPM_NAME = "perl-Plack-Middleware-FixMissingBodyInRedirect-0.12-1.28.noarch.rpm"
RPM_HASH = "a020595a1d2d7e85c714a3b1d45c32b98b91c1344c0b10f15a43bf03359336cf6617dcddfa2afd7f5fc9089b4eb7ae0dc10dcd3c8319e607be9ac6b0985c20a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Plack--Middleware--FixMissingBodyInRedirect \
perl-Plack-Middleware-FixMissingBodyInRedirect"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-HTML--Entities \
perl-Plack--Middleware \
perl-Plack--Util \
perl-parent"

inherit rpm
