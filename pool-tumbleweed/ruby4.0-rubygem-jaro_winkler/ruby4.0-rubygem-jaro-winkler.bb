SUMMARY = "Ruby & C implementation of Jaro-Winkler distance algorithm which supports UTF-8 string"
DESCRIPTION = "jaro_winkler is an implementation of Jaro-Winkler distance algorithm which is \
written in C extension and will fallback to pure Ruby version in platforms \
other than MRI/KRI like JRuby or Rubinius. Both of C and Ruby implementation \
support any kind of string encoding, such as UTF-8, EUC-JP, Big5, etc."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "ruby4.0-rubygem-jaro_winkler-1.6.0-1.8.aarch64.rpm"
RPM_HASH = "7c57c559748c7575d148d15e7e89ae0b4bf59a0219aec40b1282b50cc7eec17f4111c2fa94da962e9c535ee3a6ccfbe66de771415b8e94b905a5fd44fcef182e"

RPROVIDES:${PN} += "ruby4.0-rubygem-jaro-winkler \
rubygem-jaro-winkler \
rubygem-ruby-4.0.0-jaro-winkler \
rubygem-ruby-4.0.0-jaro-winkler-1 \
rubygem-ruby-4.0.0-jaro-winkler-1.6 \
rubygem-ruby-4.0.0-jaro-winkler-1.6.0"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libruby4.0.so.4.0 \
ruby-abi \
ruby4.0-without-jemalloc \
ruby4.0-without-yjit"

inherit rpm
