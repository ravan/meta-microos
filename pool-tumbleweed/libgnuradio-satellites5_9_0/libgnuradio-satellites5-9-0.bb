SUMMARY = "Library for gr-satellites"
DESCRIPTION = "Library files for gr-satellites."
LICENSE = "Apache-2.0 & GPL-3.0-or-later & LGPL-2.1-or-later & MIT"

PV = "5.9.0"

RPM_NAME = "libgnuradio-satellites5_9_0-5.9.0-1.1.aarch64.rpm"
RPM_HASH = "db75e940b65f49e4e75d850b3dc08bbb4a7f6dc0f0d760eea95f0ed9eaf3ae2888493a34e3fe3f82a7fae78410ac282324fea2b55836d7257f9e21c2d74f5424"

RPROVIDES:${PN} += "libgnuradio-satellites.so.5.9.0 \
libgnuradio-satellites5-9-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfmt.so.12 \
libgcc-s.so.1 \
libgnuradio-blocks.so.3.10.12 \
libgnuradio-filter.so.3.10.12 \
libgnuradio-pmt.so.3.10.12 \
libgnuradio-runtime.so.3.10.12 \
libm.so.6 \
libspdlog.so.1.17 \
libstdc++.so.6 \
libvolk.so.3.3"

inherit rpm
