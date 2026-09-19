SUMMARY = "(X)HTML validation in a Perl object"
DESCRIPTION = "'HTML::Tidy' is an HTML checker in a handy dandy object. It's meant as a \
replacement for HTML::Lint. If you're currently an HTML::Lint user looking \
to migrate, see the section Converting from HTML::Lint."
LICENSE = "Artistic-2.0"

PV = "1.60"

RPM_NAME = "perl-HTML-Tidy-1.60-1.48.aarch64.rpm"
RPM_HASH = "4f494b247eb2fefdb6f8fb19e890bcf17cf4e96830695b8b7a0936be0b6e4faa1e17adaa1321f0cf473afaf6d0323e9aca8dbae5b870d5c8a3cf74ff174b0264"

RPROVIDES:${PN} += "perl-HTML--Tidy \
perl-HTML--Tidy--Message \
perl-HTML-Tidy"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtidyp-1.04.so.0 \
perl--MODULE-COMPAT-5.44.0 \
perl-LWP--Simple \
perl-Test--More"

inherit rpm
