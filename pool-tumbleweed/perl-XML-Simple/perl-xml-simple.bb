SUMMARY = "An API for simple XML files"
DESCRIPTION = "The XML::Simple module provides a simple API layer on top of an underlying \
XML parsing module (either XML::Parser or one of the SAX2 parser modules). \
Two functions are exported: 'XMLin()' and 'XMLout()'. Note: you can \
explicitly request the lower case versions of the function names: \
'xml_in()' and 'xml_out()'. \
 \
The simplest approach is to call these two functions directly, but an \
optional object oriented interface (see 'OPTIONAL OO INTERFACE' below) \
allows them to be called as methods of an *XML::Simple* object. The object \
interface can also be used at either end of a SAX pipeline."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.25"

RPM_NAME = "perl-XML-Simple-2.25-1.33.noarch.rpm"
RPM_HASH = "5b89ffaefde8e3f13637ea490670ef0f142f781a6dc07dbdc492d7988ab7cce1705ba7220332c23fbdfe5e5691f9b6b5e1337a221d4a6f3ca33b0d4102f93296"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--Simple \
perl-XML-Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-XML--NamespaceSupport \
perl-XML--SAX \
perl-XML--SAX--Expat"

inherit rpm
