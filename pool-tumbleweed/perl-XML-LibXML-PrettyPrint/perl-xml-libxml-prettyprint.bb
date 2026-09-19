SUMMARY = "Add pleasant whitespace to a DOM tree"
DESCRIPTION = "Long XML files can be daunting for humans to read. Of course, XML is really \
designed for computers to read - not people - but there are times when mere \
mortals do need to read and edit XML by hand. For example, if your \
application stores its configuration in XML, or you need to dump some XML \
to STDOUT for debugging purposes. \
 \
Syntax highlighting helps, but to really make sense of some XML, proper \
indentation can be vital. Hence 'XML::LibXML::PrettyPrint' - it can be \
applied to an the XML::LibXML manpage DOM tree to reformat it into a more \
readable result. \
 \
Pretty-printing XML is not as CPU-efficient as dumping it out sloppily, so \
unless you're pretty sure that a human is going to need to make sense of \
your XML, you should probably not use this module."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.006"

RPM_NAME = "perl-XML-LibXML-PrettyPrint-0.006-1.31.noarch.rpm"
RPM_HASH = "0eed31f603090c3b1886fcaceffb84b1a898e0f2f9d8de6fbd22b56b0130d8c4b240d0d94ca3ed17ee968267dd546435e93a362fd1636306220bfdfe6b145360"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--LibXML--PrettyPrint \
perl-XML-LibXML-PrettyPrint"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-Exporter--Tiny \
perl-XML--LibXML \
perl-XML--Simple"

inherit rpm
