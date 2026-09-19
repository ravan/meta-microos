SUMMARY = "Ruby binding of GPGME"
DESCRIPTION = "Ruby-GPGME is a Ruby language binding of GPGME (GnuPG \
Made Easy). GnuPG Made Easy (GPGME) is a library designed to make access to \
GnuPG easier for applications. It provides a High-Level Crypto API for \
encryption, decryption, signing, signature verification and key management."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.25"

RPM_NAME = "ruby4.0-rubygem-gpgme-2.0.25-1.8.aarch64.rpm"
RPM_HASH = "ffa5eabb90df57823ee49abed7882cbc221bd6bbf3ce48821a922e32be7008eb5a1cb8e1c5502eee460272ab1e4fb404aff6a8ac6f595fc4186511f96eeede23"

RPROVIDES:${PN} += "ruby4.0-rubygem-gpgme \
rubygem-gpgme \
rubygem-ruby-4.0.0-gpgme \
rubygem-ruby-4.0.0-gpgme-2 \
rubygem-ruby-4.0.0-gpgme-2.0 \
rubygem-ruby-4.0.0-gpgme-2.0.25"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgpgme.so.45 \
libm.so.6 \
libruby4.0.so.4.0 \
ruby-abi \
ruby4.0-without-jemalloc \
ruby4.0-without-yjit \
rubygem-ruby-4.0.0-mini-portile2-2"

inherit rpm
