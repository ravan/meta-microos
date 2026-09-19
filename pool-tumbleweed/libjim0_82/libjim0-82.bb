SUMMARY = "A small embeddable Tcl interpreter"
DESCRIPTION = "Jim is an opensource small-footprint implementation of the Tcl programming language."
LICENSE = "BSD-2-Clause"

PV = "0.82"

RPM_NAME = "libjim0_82-0.82-1.11.aarch64.rpm"
RPM_HASH = "0be80169dfe03b4771a8a3ee57ab3314ae9c7b3848dce00e737c7d2ca069f2dc7ac99d1d6c52bbdf52cb514afeae4d427c68ac413416cb4d9f0bcf084df65254"

RPROVIDES:${PN} += "libjim.so.0.82 \
libjim0-82"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6 \
libssl.so.3 \
libz.so.1"

inherit rpm
