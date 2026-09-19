SUMMARY = "The X Protocol"
DESCRIPTION = "The pthread-stubs for X development"
LICENSE = "MIT"

PV = "0.5"

RPM_NAME = "pthread-stubs-devel-0.5-1.9.aarch64.rpm"
RPM_HASH = "b004022b88b01159753d96e5697870bd77d1f70b34fd773abfc1225dbd1ce05463b15b361bab7f170a37b35d1515b4abde0bbcbf4f8ceb76a23eebcd0b29a5a3"

RPROVIDES:${PN} += "pkgconfig-pthread-stubs \
pthread-stubs-devel \
xorg-x11-proto-devel-//usr/lib64/pkgconfig/pthread-stubs.pc"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
