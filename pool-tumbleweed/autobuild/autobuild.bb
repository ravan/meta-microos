SUMMARY = "Multiple configuration build tool"
DESCRIPTION = "Configures, builds and tests a source code package whose configuration is \
provided by GNU's autoconf mechanism."
LICENSE = "BSD-3-Clause"

PV = "2.11.0"

RPM_NAME = "autobuild-2.11.0-13.5.aarch64.rpm"
RPM_HASH = "526795f8bd948d5059070338cfd8eda6c382b3fc4b57aca21101ee1443d942168af7dcd00ed21970d9c03ce0fd320e34a5a5a5b6e6594048726250bf0471ab3b"

RPROVIDES:${PN} += "autobuild"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjansson.so.4 \
libm.so.6"

inherit rpm
