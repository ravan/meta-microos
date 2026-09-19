SUMMARY = "A Ruby wrapper for Linux inotify, using FFI"
DESCRIPTION = "A Ruby wrapper for Linux inotify, using FFI."
LICENSE = "MIT"

PV = "0.11.1"

RPM_NAME = "ruby4.0-rubygem-rb-inotify-0.11.1-1.11.aarch64.rpm"
RPM_HASH = "3349f02ac29809367b0d14b9473de8d46aa00dff5224b605d88381cae408d8ae1b025ba31e4450d354692a87f1941bc85ce3309f15faf42b9feecdf44eb67377"

RPROVIDES:${PN} += "ruby4.0-rubygem-rb-inotify \
rubygem-rb-inotify \
rubygem-ruby-4.0.0-rb-inotify \
rubygem-ruby-4.0.0-rb-inotify-0 \
rubygem-ruby-4.0.0-rb-inotify-0.11 \
rubygem-ruby-4.0.0-rb-inotify-0.11.1"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-ffi-1"

inherit rpm
