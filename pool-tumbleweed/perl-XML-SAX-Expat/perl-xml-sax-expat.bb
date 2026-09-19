SUMMARY = "SAX2 Driver for Expat (XML::Parser)"
DESCRIPTION = "This is an implementation of a SAX2 driver sitting on top of Expat \
(XML::Parser) which Ken MacLeod posted to perl-xml and which I have \
updated. \
 \
It is still incomplete, though most of the basic SAX2 events should be \
available. The SAX2 spec is currently available from \
http://perl-xml.sourceforge.net/perl-sax/. \
 \
A more friendly URL as well as a PODification of the spec are in the works."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.51"

RPM_NAME = "perl-XML-SAX-Expat-0.51-4.32.noarch.rpm"
RPM_HASH = "7619228bba70e6dea616973d863360683ad8109955efb363d6edda359c6fa57b693d0051ccb1049f8d9c9e0bf5cecf42423961ec1e3ee42675c39a5b6825311c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--SAX--Expat \
perl-XML-SAX-Expat"

RDEPENDS:${PN} += "/usr/bin/sh \
perl--MODULE-COMPAT-5.44.0 \
perl-XML--NamespaceSupport \
perl-XML--Parser \
perl-XML--SAX \
perl-XML--SAX--Base"

inherit rpm
