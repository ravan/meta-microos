SUMMARY = "Throw a tag at and it comes back with a checksum"
DESCRIPTION = "Frizbee is a tool you may throw a tag at and it comes back with a checksum. \
 \
It's a command-line tool designed to provide checksums for GitHub Actions and \
container images based on tags. \
 \
It also includes a set of libraries for working with tags and checksums."
LICENSE = "Apache-2.0"

PV = "0.1.11"

RPM_NAME = "frizbee-0.1.11-1.1.aarch64.rpm"
RPM_HASH = "a988b4903a04001d4196f0c0c6a83dde50c64b5c96d3f9e56b19cdbbf1c083b999192ee41f40c3844fd5d4628a5c46a6cf585036ec96b8b80ad052373a479ebd"

RPROVIDES:${PN} += "frizbee"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
