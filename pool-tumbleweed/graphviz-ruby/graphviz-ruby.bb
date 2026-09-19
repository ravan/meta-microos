SUMMARY = "Ruby Extension for Graphviz"
DESCRIPTION = "The graphviz-ruby package contains the ruby extension for the graphviz \
tools."
LICENSE = "EPL-2.0"

PV = "15.0.0"

RPM_NAME = "graphviz-ruby-15.0.0-2.3.aarch64.rpm"
RPM_HASH = "ceaefc77f638edddb896f3290317d9fe0aa9fab4b3dec30310c20d66fc9f062ce2de89bb023eacdc215e125fdee0cce9bb31dc7704862d12e1654afd541ab32f"

RPROVIDES:${PN} += "graphviz-ruby \
libgv-ruby.so"

RDEPENDS:${PN} += "graphviz \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcgraph.so.8 \
libgcc-s.so.1 \
libgvc.so.7 \
libruby4.0.so.4.0 \
libstdc++.so.6 \
ruby"

inherit rpm
