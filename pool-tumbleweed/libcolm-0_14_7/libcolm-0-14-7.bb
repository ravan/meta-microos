SUMMARY = "The Colm programming language runtime"
DESCRIPTION = "Colm is a programming language designed for the analysis and \
transformation of computer languages."
LICENSE = "MIT"

PV = "0.14.7"

RPM_NAME = "libcolm-0_14_7-0.14.7-2.16.aarch64.rpm"
RPM_HASH = "829b1788bf76d96318a593265fe0c87e57a85f9b36abf198eb756b58ec123f86ec20efd90dd8afb2db4c34f0c62242e490cf3a83fd9dd8b328a0af713881ad14"

RPROVIDES:${PN} += "libcolm-0-14-7 \
libcolm-0.14.7.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
