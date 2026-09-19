SUMMARY = "Shared libraries for qpdf"
DESCRIPTION = "This packages contains the shared libraries required for the qpdf \
package."
LICENSE = "Apache-2.0"

PV = "12.4.1"

RPM_NAME = "libqpdf30-12.4.1-1.1.aarch64.rpm"
RPM_HASH = "9bac7507cffc6249fd50868db3aa906015d47ce394213a3f93b78cf7fc08d9b027d19b4f3bafd4d581b416dc223f0ed5fc03ed24223ceaf655f32521d6f2dadc"

RPROVIDES:${PN} += "libqpdf.so.30 \
libqpdf30"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgnutls.so.30 \
libjpeg.so.8 \
libstdc++.so.6 \
libz.so.1 \
libzopfli.so.1"

inherit rpm
