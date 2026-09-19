SUMMARY = "Xmlhash is a naive form of XML::Simple"
DESCRIPTION = "A small C module that wraps libxml2's xmlreader to parse a XML \
string into a ruby hash."
LICENSE = "MIT"

PV = "1.3.9"

RPM_NAME = "ruby4.0-rubygem-xmlhash-1.3.9-1.17.aarch64.rpm"
RPM_HASH = "0bc1215078c36c5e36195a6ae6ebc093a486748bc8dbed2733440699a3cc1eb227928bce06a77e212231d0fa19e57c9b178f46fa4799706a4dbe5cb55444eb9e"

RPROVIDES:${PN} += "ruby4.0-rubygem-xmlhash \
rubygem-ruby-4.0.0-xmlhash \
rubygem-ruby-4.0.0-xmlhash-1 \
rubygem-ruby-4.0.0-xmlhash-1.3 \
rubygem-ruby-4.0.0-xmlhash-1.3.9 \
rubygem-xmlhash"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6 \
libruby4.0.so.4.0 \
libxml2.so.16 \
ruby-abi \
ruby4.0-without-jemalloc \
ruby4.0-without-yjit \
rubygem-ruby-4.0.0-pkg-config"

inherit rpm
