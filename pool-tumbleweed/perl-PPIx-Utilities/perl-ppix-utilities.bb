SUMMARY = "Extensions to L<PPI|PPI>"
DESCRIPTION = "This is a collection of functions for dealing with PPI objects, many of \
which originated in Perl::Critic. They are organized into modules by the \
kind of PPI class they relate to, by replacing the 'PPI' at the front of \
the module name with 'PPIx::Utilities', e.g. functionality related to \
PPI::Nodes is in PPIx::Utilities::Node."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.001000"

RPM_NAME = "perl-PPIx-Utilities-1.001000-14.31.noarch.rpm"
RPM_HASH = "5c3b404de4df3735de942732906a40d7687b309e1149bc00e93da5eb7dcd218e1d9cc822f464ac87b3797b0c84fde19312a5ee467e773842d6f20f19b855667d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-PPIx--Utilities \
perl-PPIx--Utilities--Exception--Bug \
perl-PPIx--Utilities--Node \
perl-PPIx--Utilities--Statement \
perl-PPIx-Utilities"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Exception--Class \
perl-PPI \
perl-PPI--Document--Fragment \
perl-Readonly \
perl-Task--Weaken"

inherit rpm
