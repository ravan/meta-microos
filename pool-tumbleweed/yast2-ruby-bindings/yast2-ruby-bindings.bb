SUMMARY = "Ruby bindings for the YaST platform"
DESCRIPTION = "The bindings allow YaST modules to be written using the Ruby language \
and also Ruby scripts can use YaST agents, APIs and modules."
LICENSE = "GPL-2.0-only"

PV = "5.0.6"

RPM_NAME = "yast2-ruby-bindings-5.0.6-1.4.aarch64.rpm"
RPM_HASH = "3daebb8bc8348412895136c972dd76b52407d56f8c7053e2658d50df01a6d59b8d9f0b5b54d630c12ea2f7cd4eb7965f203e5f4ddfb102ef180d518419cd74b5"

RPROVIDES:${PN} += "libpy2lang-ruby.so \
yast2-ruby-bindings"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libpy2UI.so.2 \
libpy2scr.so.2 \
libpy2wfm.so.2 \
libruby4.0.so.4.0 \
libstdc++.so.6 \
liby2.so.4 \
libycp.so.5 \
ruby \
rubygem-ruby-4.0.0-fast-gettext \
yast2-core \
yast2-ycp-ui-bindings"

inherit rpm
