SUMMARY = "Syntax sugar for transactional methods"
DESCRIPTION = "This method exports the 'transactional' declarator that will enclose the \
method in a txn_do call."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.009"

RPM_NAME = "perl-MooseX-TransactionalMethods-0.009-2.35.noarch.rpm"
RPM_HASH = "060d8d2af06b09bca0216265eae06ff0ecad21565434bcb71695350ac690e91fa3431404ef7d9189bf44ba552b44726d61337efee853a67346333c3a8b49ae3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Meta--Method--Transactional \
perl-MooseX--Meta--Method--Transactional--Application--ToClass \
perl-MooseX--Meta--Method--Transactional--Application--ToComposite \
perl-MooseX--Meta--Method--Transactional--Application--ToInstance \
perl-MooseX--Meta--Method--Transactional--Meta--Role \
perl-MooseX--TransactionalMethods \
perl-MooseX-TransactionalMethods"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Moose \
perl-Sub--Name \
perl-aliased"

inherit rpm
