SUMMARY = "Ruby bindings for the libdnf5-cli library"
DESCRIPTION = "Ruby bindings for the libdnf5-cli library."
LICENSE = "LGPL-2.1-or-later"

PV = "5.4.2.1"

RPM_NAME = "ruby-libdnf5-cli-5.4.2.1-1.3.aarch64.rpm"
RPM_HASH = "1f23fde56534aa5e26f864a4927ee8c9b2fb0f52895a601ed49e5fd045c3b102577f2866cdac9ed84e6f541137ac5ada72b16eaaa0103eecdadc7220bdd84696"

RPROVIDES:${PN} += "ruby-libdnf-cli \
ruby-libdnf5-cli"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdnf5-cli.so.3 \
libdnf5-cli3 \
libgcc-s.so.1 \
libruby4.0.so.4.0 \
libstdc++.so.6"

inherit rpm
