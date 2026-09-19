SUMMARY = "Simple API for XML"
DESCRIPTION = "XML::SAX is a SAX parser access API for Perl. It includes classes and APIs \
required for implementing SAX drivers, along with a factory class for \
returning any SAX parser installed on the user's system."
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PV = "1.02"

RPM_NAME = "perl-XML-SAX-1.02-2.12.noarch.rpm"
RPM_HASH = "f6521a88d9e704da2ccd73b2c337be3e45df5307d00d5ac6c1afad90e4d341e483be4057b950fee4b2e91fa8b5e08c2545fe3c3d52b8fe99773c8a7f423900ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--SAX \
perl-XML--SAX--DocumentLocator \
perl-XML--SAX--ParserFactory \
perl-XML--SAX--PurePerl \
perl-XML--SAX--PurePerl--DebugHandler \
perl-XML--SAX--PurePerl--Exception \
perl-XML--SAX--PurePerl--Productions \
perl-XML--SAX--PurePerl--Reader \
perl-XML--SAX--PurePerl--Reader--Stream \
perl-XML--SAX--PurePerl--Reader--String \
perl-XML--SAX--PurePerl--Reader--URI \
perl-XML-SAX"

RDEPENDS:${PN} += "/usr/bin/sh \
perl--MODULE-COMPAT-5.44.0 \
perl-XML--NamespaceSupport \
perl-XML--SAX--Base"

inherit rpm
