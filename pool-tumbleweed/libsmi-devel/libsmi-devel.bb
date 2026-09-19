SUMMARY = "Libsmi Header Files And Static Libraries"
DESCRIPTION = "This package contains the header files and static libraries of package \
libsmi."
LICENSE = "MIT"

PV = "0.4.8"

RPM_NAME = "libsmi-devel-0.4.8-29.6.aarch64.rpm"
RPM_HASH = "d25c391386d7d28cb623c2ebc1e8d4e32a9156de90d8b7b193899cbf190753638f80b05f6210248a75151179ad55018fd7e290dce586d215dd86ac6348fd0b71"

RPROVIDES:${PN} += "libsmi-devel \
pkgconfig-libsmi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libsmi"

inherit rpm
