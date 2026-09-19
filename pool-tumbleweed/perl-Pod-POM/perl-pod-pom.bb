SUMMARY = "POD Object Model"
DESCRIPTION = "This module implements a parser to convert Pod documents into a simple \
object model form known hereafter as the Pod Object Model. The object model \
is generated as a hierarchical tree of nodes, each of which represents a \
different element of the original document. The tree can be walked manually \
and the nodes examined, printed or otherwise manipulated. In addition, \
Pod::POM supports and provides view objects which can automatically \
traverse the tree, or section thereof, and generate an output \
representation in one form or another."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "2.01"

RPM_NAME = "perl-Pod-POM-2.01-1.41.noarch.rpm"
RPM_HASH = "a0907fa9ea964909979d88b8c95e1036aebf13218623015861b3fd5d2af100a95de0a036480ba1a2ae14326349e3e58a6a4ea5a84f80df0969de551be0b9f432"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Pod--POM \
perl-Pod--POM--Constants \
perl-Pod--POM--Node \
perl-Pod--POM--Node--Begin \
perl-Pod--POM--Node--Code \
perl-Pod--POM--Node--Content \
perl-Pod--POM--Node--For \
perl-Pod--POM--Node--Head1 \
perl-Pod--POM--Node--Head2 \
perl-Pod--POM--Node--Head3 \
perl-Pod--POM--Node--Head4 \
perl-Pod--POM--Node--Item \
perl-Pod--POM--Node--Over \
perl-Pod--POM--Node--Pod \
perl-Pod--POM--Node--Sequence \
perl-Pod--POM--Node--Text \
perl-Pod--POM--Node--Verbatim \
perl-Pod--POM--Nodes \
perl-Pod--POM--Test \
perl-Pod--POM--View \
perl-Pod--POM--View--HTML \
perl-Pod--POM--View--Pod \
perl-Pod--POM--View--Text \
perl-Pod-POM"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-parent"

inherit rpm
