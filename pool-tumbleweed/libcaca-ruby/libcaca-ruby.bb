SUMMARY = "Ruby bindings for libcaca"
DESCRIPTION = "All that is needed to use libcaca from ruby code."
LICENSE = "WTFPL"

PV = "0.99.beta20+git.1776622070.7c8e333"

RPM_NAME = "libcaca-ruby-0.99.beta20+git.1776622070.7c8e333-2.3.aarch64.rpm"
RPM_HASH = "83fa32a69300e0ca0367ed836b950f3f064c9c1a8659473f205881edfd053cc897c812584e392824ac3fa64fa20edd8112a739acfa6abce3a3bd69f81ec5c0ed"

RPROVIDES:${PN} += "libcaca-ruby"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcaca \
libcaca.so.0 \
libruby4.0.so.4.0 \
ruby"

inherit rpm
