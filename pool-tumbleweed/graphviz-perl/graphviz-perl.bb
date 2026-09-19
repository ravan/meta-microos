SUMMARY = "Perl extension for Graphviz"
DESCRIPTION = "The graphviz-perl package contains the Perl extension for the graphviz \
tools."
LICENSE = "EPL-2.0"

PV = "15.0.0"

RPM_NAME = "graphviz-perl-15.0.0-2.3.aarch64.rpm"
RPM_HASH = "e23218c8c21e0f45af04b67dfb2dab7d4a0ec760ecca90bf55ccefbb2b44e93aeb2a2be9d6353056bbf95321bd2e8889ba61c55bc0dfb591b8b6b62584a7e24a"

RPROVIDES:${PN} += "graphviz-perl \
libgv-perl.so \
perl-gv \
perl-gvc"

RDEPENDS:${PN} += "graphviz \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcgraph.so.8 \
libgcc-s.so.1 \
libgvc.so.7 \
libperl.so \
libstdc++.so.6 \
perl"

inherit rpm
