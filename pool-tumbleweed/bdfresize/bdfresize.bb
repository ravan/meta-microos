SUMMARY = "A Tool for Resizing BDF Format Fonts"
DESCRIPTION = "bdfresize is a command for magnifying or shrinking fonts described in the \
standard BDF format."
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "bdfresize-1.5-573.9.aarch64.rpm"
RPM_HASH = "d472465ba91b9e0d5c327af9b02f5c60f93244706c7d0bdb3f86e6bf45ca17110357b62c2718c3dd6e2f34661904bb7524462f91f8694a2709d6b8e58fad2abe"

RPROVIDES:${PN} += "bdfresize"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
