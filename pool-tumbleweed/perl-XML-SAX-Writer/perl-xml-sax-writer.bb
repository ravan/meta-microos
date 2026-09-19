SUMMARY = "SAX2 XML Writer"
DESCRIPTION = "SAX2 XML Writer"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.57"

RPM_NAME = "perl-XML-SAX-Writer-0.57-1.38.noarch.rpm"
RPM_HASH = "693aab52c1f3d2526e3e1208b7307d8fdabaea4123d042b2acc86c507053748b3e487c72ccb7a4534242556d2b2c1244d7c0fc69f57b9715ae99514b04353e18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--SAX--Writer \
perl-XML--SAX--Writer--ArrayConsumer \
perl-XML--SAX--Writer--CodeConsumer \
perl-XML--SAX--Writer--ConsumerInterface \
perl-XML--SAX--Writer--Encode \
perl-XML--SAX--Writer--FileConsumer \
perl-XML--SAX--Writer--HandleConsumer \
perl-XML--SAX--Writer--NullConverter \
perl-XML--SAX--Writer--StringConsumer \
perl-XML--SAX--Writer--XML \
perl-XML-SAX-Writer"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-XML--Filter--BufferText \
perl-XML--NamespaceSupport \
perl-XML--SAX--Exception"

inherit rpm
