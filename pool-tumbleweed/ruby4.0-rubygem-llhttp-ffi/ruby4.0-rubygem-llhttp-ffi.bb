SUMMARY = "Ruby FFI bindings for llhttp"
DESCRIPTION = "Ruby FFI bindings for llhttp."
LICENSE = "MPL-2.0"

PV = "0.5.0"

RPM_NAME = "ruby4.0-rubygem-llhttp-ffi-0.5.0-1.16.aarch64.rpm"
RPM_HASH = "8e71a81c542a89ed7bfdc525e47925bc3615770fb93af724d109633e25a63c8d80de633af89db589036b0820a95481d84f634af1d1ac94f1f2907c24213222d4"

RPROVIDES:${PN} += "libllhttp-ext.so \
ruby4.0-rubygem-llhttp-ffi \
rubygem-llhttp-ffi \
rubygem-ruby-4.0.0-llhttp-ffi \
rubygem-ruby-4.0.0-llhttp-ffi-0 \
rubygem-ruby-4.0.0-llhttp-ffi-0.5 \
rubygem-ruby-4.0.0-llhttp-ffi-0.5.0"

RDEPENDS:${PN} += "libc.so.6 \
ruby-abi \
ruby4.0-without-jemalloc \
ruby4.0-without-yjit \
rubygem-ruby-4.0.0-ffi-compiler-1 \
rubygem-ruby-4.0.0-rake-13"

inherit rpm
