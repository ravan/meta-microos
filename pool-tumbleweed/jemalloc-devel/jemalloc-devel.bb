SUMMARY = "Development files for jemalloc"
DESCRIPTION = "Headers for jemalloc, general-purpose scalable concurrent malloc(3) \
implementation."
LICENSE = "BSD-2-Clause"

PV = "5.3.1"

RPM_NAME = "jemalloc-devel-5.3.1-1.4.aarch64.rpm"
RPM_HASH = "fe4fa0907fd7387470e5b80dd4c304a536ad670a59c2df87c2c8def577d2d37835ad927a8a8c3bd97920496a93a8cef442e986cce6384442692b985d2477d005"

RPROVIDES:${PN} += "jemalloc-devel \
pkgconfig-jemalloc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjemalloc2"

inherit rpm
