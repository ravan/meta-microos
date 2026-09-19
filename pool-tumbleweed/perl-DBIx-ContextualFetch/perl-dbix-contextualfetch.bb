SUMMARY = "Add contextual fetches to DBI"
DESCRIPTION = "It always struck me odd that DBI didn't take much advantage of Perl's \
context sensitivity. DBIx::ContextualFetch redefines some of the various \
fetch methods to fix this oversight. It also adds a few new methods for \
convenience (though not necessarily efficiency)."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.03"

RPM_NAME = "perl-DBIx-ContextualFetch-1.03-5.42.noarch.rpm"
RPM_HASH = "6cfefbbc52d65ff7cb1746604c61a987d78bc0b905c2b7c91951024a93d9bb90f124b3d1ab4be606e74a71bcf9065f66b18075ba2056e8635ae5b23f069b563c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DBIx--ContextualFetch \
perl-DBIx--ContextualFetch--db \
perl-DBIx--ContextualFetch--st \
perl-DBIx-ContextualFetch"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-DBI"

inherit rpm
