SUMMARY = "Development files to link against Ruby"
DESCRIPTION = "Development files to link against Ruby."
LICENSE = "BSD-2-Clause | Ruby"

PV = "4.0.6"

RPM_NAME = "ruby4.0-devel-4.0.6-2.1.aarch64.rpm"
RPM_HASH = "85af37d8c764defc545634f3e4e1768ffd23a204502a92939da899046ec4e300e34589d826d41c4068878d3a38da20ec84e7bc8774672c29ac4b863cb69e8dce"

RPROVIDES:${PN} += "pkgconfig-ruby-4.0 \
ruby4.0-devel \
rubygems \
rubygems-with-buildroot-patch"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ruby4.0"

inherit rpm
