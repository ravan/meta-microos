SUMMARY = "WebDAV client library for Perl5"
DESCRIPTION = "HTTP::DAV is a Perl API for interacting with and modifying content on \
webservers using the WebDAV protocol. Now you can LOCK, DELETE and PUT \
files and much more on a DAV-enabled webserver."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.500.0"

RPM_NAME = "perl-HTTP-DAV-0.500.0-1.10.noarch.rpm"
RPM_HASH = "073336f01408756e935294200517bdaee473930f67d3d942f6ff531b25802bb6eba2d114deb1537f4ef9ea36b647b5b2e9ccc088215ddb5db4f7ff5d4628f090"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTTP--DAV \
perl-HTTP--DAV--Comms \
perl-HTTP--DAV--Headers \
perl-HTTP--DAV--Lock \
perl-HTTP--DAV--Resource \
perl-HTTP--DAV--ResourceList \
perl-HTTP--DAV--Response \
perl-HTTP--DAV--UserAgent \
perl-HTTP--DAV--Utils \
perl-HTTP-DAV"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-LWP \
perl-URI \
perl-URI--Escape \
perl-XML--DOM"

inherit rpm
