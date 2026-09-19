SUMMARY = "Select a pager (possibly perl-based) & pipe it text if a TTY"
DESCRIPTION = "IO::Pager can be used to locate an available pager and set the _PAGER_ \
environment variable (see NOTES). It is also a factory for creating I/O \
objects such as IO::Pager::Buffered and IO::Pager::Unbuffered. \
 \
IO::Pager subclasses are designed to programmatically decide whether or not \
to pipe a filehandle's output to a program specified in _PAGER_. Subclasses \
may implement only the IO handle methods desired and inherit the remainder \
of those outlined below from IO::Pager. For anything else, YMMV. See the \
appropriate subclass for implementation specific details."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.10"

RPM_NAME = "perl-IO-Pager-2.10-1.27.noarch.rpm"
RPM_HASH = "e638f9f0fb97559edadf8f36f4048072e6c524d754919a9c5cdbb0d48f174847439f237b2192b52749f9f869e747986b0323a26ac29077dc0762505f6fb455b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-IO--Pager \
perl-IO--Pager--Buffered \
perl-IO--Pager--Page \
perl-IO--Pager--Perl \
perl-IO--Pager--Unbuffered \
perl-IO--Pager--less \
perl-IO-Pager"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-File--Which \
perl-Term--ReadKey"

inherit rpm
