SUMMARY = "Provide API used in translator modules without translating"
DESCRIPTION = "'MooX::Locale::Passthrough' is made to allow CPAN modules use translator \
API without adding heavy dependencies (external software) or requirements \
(operating resulting solution). \
 \
This software is released together with MooX::Locale::TextDomain::OO, which \
allowes then to plugin any desired translation."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.001"

RPM_NAME = "perl-MooX-Locale-Passthrough-0.001-1.28.noarch.rpm"
RPM_HASH = "2c6b179e9372a326a60715afa1dbf7187658e8e806d43c87b82491e4efb340828d6f5790697ca97a909927be2af75c45fde417ed5706f6fe577bbeb7f421226d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooX--Locale--Passthrough \
perl-MooX-Locale-Passthrough"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Moo"

inherit rpm
