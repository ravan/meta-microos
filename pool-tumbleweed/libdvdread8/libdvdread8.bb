SUMMARY = "Library for Reading DVD Video Images"
DESCRIPTION = "This package contains shared libraries for accessing DVD images (this \
package does not contain DeCSS algorithms)."
LICENSE = "GPL-2.0-or-later"

PV = "7.1.1"

RPM_NAME = "libdvdread8-7.1.1-1.1.aarch64.rpm"
RPM_HASH = "7d1e1161bc59b5bd39f5f067b4789c822728c33e32d3cf127c543efeed26ba5eca00fab2a7cb1d33df4301864530a18656bad8337f9347eb2f32adc7b226e80a"

RPROVIDES:${PN} += "libdvdread \
libdvdread.so.8 \
libdvdread8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
