SUMMARY = "OpenBSD's bcrypt_pbkdf (a variant of PBKDF2 with bcrypt-based PRF)"
DESCRIPTION = "This gem implements bcrypt_pbkdf (a variant of PBKDF2 with bcrypt-based \
PRF)."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "ruby4.0-rubygem-bcrypt_pbkdf-1.1.1-1.12.aarch64.rpm"
RPM_HASH = "4465f5f9a39506b24ac6635274ebf762b65c08322ddf32072ea4f81533b9650ed906668abe6b1272a1a40615c7a5e716b4f15cd3ee473518f67735ffc8f0baba"

RPROVIDES:${PN} += "ruby4.0-rubygem-bcrypt-pbkdf \
rubygem-bcrypt-pbkdf \
rubygem-ruby-4.0.0-bcrypt-pbkdf \
rubygem-ruby-4.0.0-bcrypt-pbkdf-1 \
rubygem-ruby-4.0.0-bcrypt-pbkdf-1.1 \
rubygem-ruby-4.0.0-bcrypt-pbkdf-1.1.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libruby4.0.so.4.0 \
ruby-abi \
ruby4.0-without-jemalloc \
ruby4.0-without-yjit"

inherit rpm
