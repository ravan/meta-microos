SUMMARY = "A FFI wrapper around the system GSSAPI library"
DESCRIPTION = "A FFI wrapper around the system GSSAPI library. Please make sure and read \
the \
Yard docs or standard GSSAPI documentation if you have any questions. \
There is also a class called GSSAPI::Simple that wraps many of the common \
features \
used for GSSAPI."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "ruby4.0-rubygem-gssapi-1.3.1-1.27.aarch64.rpm"
RPM_HASH = "5d4ddb893209cf3d26a0b0c0d85fb29bf168e45146565a73d2947f6370fe670726f026ceb729760f0746b37d7503dc691febf1ea0cdfb14819ec18302f6a912f"

RPROVIDES:${PN} += "ruby4.0-rubygem-gssapi \
rubygem-gssapi \
rubygem-ruby-4.0.0-gssapi \
rubygem-ruby-4.0.0-gssapi-1 \
rubygem-ruby-4.0.0-gssapi-1.3 \
rubygem-ruby-4.0.0-gssapi-1.3.1"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-ffi"

inherit rpm
