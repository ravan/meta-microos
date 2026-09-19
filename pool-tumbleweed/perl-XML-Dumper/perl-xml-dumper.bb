SUMMARY = "Perl module for dumping Perl objects from/to XML"
DESCRIPTION = "XML::Dumper dumps Perl data to XML format. XML::Dumper can also read \
XML data that was previously dumped by the module and convert it back \
to Perl. You can use the module read the XML from a file and write the \
XML to a file. Perl objects are blessed back to their original \
packaging; if the modules are installed on the system where the perl \
objects are reconstituted from xml, they will behave as expected. \
Intuitively, if the perl objects are converted and reconstituted in the \
same environment, all should be well. And it is. \
 \
  Authors: \
		Mike Wong <mike_w3@pacbell.net> \
		Jonathan Eisenzopf <eisen@pobox.com>"
LICENSE = "Artistic-1.0 | GPL-2.0+"

PV = "0.81"

RPM_NAME = "perl-XML-Dumper-0.81-69.46.aarch64.rpm"
RPM_HASH = "8a9990448636df0a2909ee0faa6980aa2390d280833c766fe6085af1a457a2816df4dbd6c42e117bf75b1c4feb8ad1cd80f37c25066e3b54e7e522b1e805a872"

RPROVIDES:${PN} += "perl-XML--Dumper \
perl-XML-Dumper"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-XML-Parser"

inherit rpm
