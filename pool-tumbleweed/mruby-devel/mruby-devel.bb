SUMMARY = "Lightweight Ruby Embedded Environment"
DESCRIPTION = "mruby is the lightweight implementation of the Ruby language complying to (part \
of) the ISO standard. \
 \
This package contains the headers and static library files in order to embed \
mruby into your application."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "mruby-devel-4.0.0-1.1.aarch64.rpm"
RPM_HASH = "ddd17b46500afa1ca6b32106f4fc553da320ab4504f0b345a8fe7d6aaa9ca50f6e84371c38bbaad593545f02dad448c90e4e8f333c55937b01ad98328c7c28a4"

RPROVIDES:${PN} += "mruby-devel"

RDEPENDS:${PN} += "libmruby-core4-0-0 \
libmruby4-0-0"

inherit rpm
