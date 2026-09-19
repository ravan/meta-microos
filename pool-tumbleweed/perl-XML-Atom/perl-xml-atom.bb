SUMMARY = "Atom feed and API implementation"
DESCRIPTION = "Atom is a syndication, API, and archiving format for weblogs and other \
data. _XML::Atom_ implements the feed format as well as a client for the \
API."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.430.0"

RPM_NAME = "perl-XML-Atom-0.430.0-1.5.noarch.rpm"
RPM_HASH = "b7cd62ae023f8e1991ec7b8747ededfd7137cee990fa85004af39296e1d38e5534c2a3e826898f0f492e859f63000aeab6ad36d42f9551456a1d9816cfb3ec3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-LWP--UserAgent--AtomClient \
perl-XML--Atom \
perl-XML--Atom--Base \
perl-XML--Atom--Category \
perl-XML--Atom--Client \
perl-XML--Atom--Content \
perl-XML--Atom--Entry \
perl-XML--Atom--ErrorHandler \
perl-XML--Atom--Feed \
perl-XML--Atom--Link \
perl-XML--Atom--Namespace \
perl-XML--Atom--Person \
perl-XML--Atom--Server \
perl-XML--Atom--Thing \
perl-XML--Atom--Util \
perl-XML-Atom"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Class--Data--Inheritable \
perl-DateTime \
perl-DateTime--TimeZone \
perl-Digest--SHA \
perl-LWP--UserAgent \
perl-URI \
perl-XML--LibXML \
perl-XML--XPath"

inherit rpm
