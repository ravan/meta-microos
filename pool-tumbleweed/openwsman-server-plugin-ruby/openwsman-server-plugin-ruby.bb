SUMMARY = "OpenWSMAN Server Plugin for Ruby extensions"
DESCRIPTION = "This package provides a OpenWSMAN server plugin to write a \
WS-Management resource handler in Ruby."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2.8.1"

RPM_NAME = "openwsman-server-plugin-ruby-2.8.1-5.1.aarch64.rpm"
RPM_HASH = "043233c9eb7a0ffdecb34ea966b2a8ae2b5a23d2f4973d8b6fe088ab832676d92ad45152b83805542b83f6cfd42fa7cd5f56b8336071c73a4f9f1a390b8e13ae"

RPROVIDES:${PN} += "libwsman-ruby-plugin.so \
openwsman-server-plugin-ruby"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libruby4.0.so.4.0 \
openwsman-server"

inherit rpm
