SUMMARY = "OpenBSD's bcrypt() password hashing algorithm"
DESCRIPTION = "bcrypt() is a sophisticated and secure hash algorithm designed by The \
OpenBSD project \
for hashing passwords. The bcrypt Ruby gem provides a simple wrapper for \
safely handling \
passwords."
LICENSE = "MIT"

PV = "3.1.20"

RPM_NAME = "ruby4.0-rubygem-bcrypt-3.1.20-1.16.aarch64.rpm"
RPM_HASH = "41e415157ad3bc2a0988c1c914d427ed11829843a9b99de97f7eccee070389f59d20780d3173568abf3ecd86527032ff76b49224c7c200caa2fbf1be59515e43"

RPROVIDES:${PN} += "ruby4.0-rubygem-bcrypt \
rubygem-bcrypt \
rubygem-ruby-4.0.0-bcrypt \
rubygem-ruby-4.0.0-bcrypt-3 \
rubygem-ruby-4.0.0-bcrypt-3.1 \
rubygem-ruby-4.0.0-bcrypt-3.1.20"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libruby4.0.so.4.0 \
ruby-abi \
ruby4.0-without-jemalloc \
ruby4.0-without-yjit"

inherit rpm
