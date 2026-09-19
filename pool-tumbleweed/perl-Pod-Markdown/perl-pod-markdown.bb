SUMMARY = "Convert POD to Markdown"
DESCRIPTION = "This module uses Pod::Simple to convert POD to Markdown. \
 \
Literal characters in Pod that are special in Markdown (like *asterisks*) \
are backslash-escaped when appropriate. \
 \
By default 'markdown' and 'html' formatted regions are accepted. Regions of \
'markdown' will be passed through unchanged. Regions of 'html' will be \
placed inside a '<div>' tag so that markdown characters won't be processed. \
Regions of ':markdown' or ':html' will be processed as POD and included. To \
change which regions are accepted use the Pod::Simple API: \
 \
  my $parser = Pod::Markdown->new; \
  $parser->unaccept_targets(qw( markdown html ));"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.400.0"

RPM_NAME = "perl-Pod-Markdown-3.400.0-2.12.noarch.rpm"
RPM_HASH = "9c3c5480add61614bf2cf669f665f675c0d247eee630a6f8edb6724977c343752d0522c5d9feb3cf12467d3c1e59a219b838241c156e833815180944b0d5b960"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Pod--Markdown \
perl-Pod--Perldoc--ToMarkdown \
perl-Pod-Markdown"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-Pod--Simple \
perl-Pod--Simple--Methody \
perl-URI--Escape \
perl-parent"

inherit rpm
