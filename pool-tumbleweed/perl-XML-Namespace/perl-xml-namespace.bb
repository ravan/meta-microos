SUMMARY = "Simple support for XML Namespaces"
DESCRIPTION = "This module implements a simple object for representing XML Namespaces in \
Perl. It provides little more than some syntactic sugar for your Perl \
programs, saving you the bother of typing lots of long-winded URIs. It was \
inspired by the Class::RDF::NS module distributed as part of Class::RDF."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.02"

RPM_NAME = "perl-XML-Namespace-0.02-1.42.noarch.rpm"
RPM_HASH = "ad25465bdce723a0fa762311da753a2fc747ac19f1c83593aef6acb586d07b887caaa36fdc1bdc54ae4c6d8cb8f9c485fbfc72a2de10603a46594bddf58f7edf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--Namespace \
perl-XML-Namespace"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
