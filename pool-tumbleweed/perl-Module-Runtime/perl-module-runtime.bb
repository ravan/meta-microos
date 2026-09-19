SUMMARY = "Runtime module handling"
DESCRIPTION = "The functions exported by this module deal with runtime handling of Perl \
modules, which are normally handled at compile time. This module avoids \
using any other modules, so that it can be used in low-level \
infrastructure. \
 \
The parts of this module that work with module names apply the same syntax \
that is used for barewords in Perl source. In principle this syntax can \
vary between versions of Perl, and this module applies the syntax of the \
Perl on which it is running. In practice the usable syntax hasn't changed \
yet. There's some intent for Unicode module names to be supported in the \
future, but this hasn't yet amounted to any consistent facility. \
 \
The functions of this module whose purpose is to load modules include \
workarounds for three old Perl core bugs regarding 'require'. These \
workarounds are applied on any Perl version where the bugs exist, except \
for a case where one of the bugs cannot be adequately worked around in pure \
Perl."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.18.0"

RPM_NAME = "perl-Module-Runtime-0.18.0-1.7.noarch.rpm"
RPM_HASH = "f67b81c691bb80fd954448af56d4eb1d3441152cdcb66d84d6edca46138f6021da24f6256b6e9127894f7147e260316149e63c6e495747e678efb966ca875389"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Runtime \
perl-Module-Runtime"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
