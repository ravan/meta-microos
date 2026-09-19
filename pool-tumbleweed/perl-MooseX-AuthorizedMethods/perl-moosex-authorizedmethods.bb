SUMMARY = "Syntax sugar for authorized methods"
DESCRIPTION = "This method exports the 'authorized' declarator that makes a verification \
if the user has the required permissions before the acual invocation. The \
default verification method will take the 'user' method result and call \
'roles' to list the roles given to that user."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.006"

RPM_NAME = "perl-MooseX-AuthorizedMethods-0.006-11.17.noarch.rpm"
RPM_HASH = "e3e0ba7753d3bde7cfa72d0d08579ef37d89c63fdb16bc8a174e8315fd8a30afbe0ed6110b7bdb4003445310c4bfbdc26d9167ee5010ccca9d317aad40d7ff84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--AuthorizedMethods \
perl-MooseX--Meta--Method--Authorized \
perl-MooseX--Meta--Method--Authorized--Application--ToClass \
perl-MooseX--Meta--Method--Authorized--Application--ToComposite \
perl-MooseX--Meta--Method--Authorized--Application--ToInstance \
perl-MooseX--Meta--Method--Authorized--CheckRoles \
perl-MooseX--Meta--Method--Authorized--Meta--Role \
perl-MooseX-AuthorizedMethods"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Moose \
perl-aliased"

inherit rpm
