SUMMARY = "Unicode Normalization Form support library for CRuby"
DESCRIPTION = "Unicode Normalization Form support library for CRuby."
LICENSE = "MIT"

PV = "0.0.9.1"

RPM_NAME = "ruby4.0-rubygem-unf_ext-0.0.9.1-1.16.aarch64.rpm"
RPM_HASH = "2050fabe62acca40e6c69db6434697f2ee8d242d89d4a0e2e0c0e1e9029ce6910b2eb474147cdd1d49130bdf42a3d3fca84b5e99f55cb671a0ce3fe61b7abb3d"

RPROVIDES:${PN} += "ruby4.0-rubygem-unf-ext \
rubygem-ruby-4.0.0-unf-ext \
rubygem-ruby-4.0.0-unf-ext-0 \
rubygem-ruby-4.0.0-unf-ext-0.0 \
rubygem-ruby-4.0.0-unf-ext-0.0.9 \
rubygem-unf-ext"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libruby4.0.so.4.0 \
libstdc++.so.6 \
ruby-abi \
ruby4.0-without-jemalloc \
ruby4.0-without-yjit"

inherit rpm
