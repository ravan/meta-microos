SUMMARY = "Utility functions for PPI"
DESCRIPTION = "'PPIx::Utils' is a collection of utility functions for working with PPI \
documents. The functions are organized into submodules, and may be imported \
from the appropriate submodule or via this module. \
 \
These functions were originally from Perl::Critic::Utils and related \
modules, and have been split off to this distribution for use outside of \
Perl::Critic."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.4.0"

RPM_NAME = "perl-PPIx-Utils-0.4.0-1.7.noarch.rpm"
RPM_HASH = "1963d40fababd11aaac0043234f6b1aae1ccbdc2794509958572b6d529dc4017626f19183d9c3e6da1e535dba8c0fd7b53ca0cb0bb8748b5fd9384eb61a31c1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-PPIx--Utils \
perl-PPIx--Utils--Classification \
perl-PPIx--Utils--Language \
perl-PPIx--Utils--Traversal \
perl-PPIx-Utils"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-B--Keywords \
perl-PPI"

inherit rpm
