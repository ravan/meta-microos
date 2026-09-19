SUMMARY = "GNU Plotting Utilities"
DESCRIPTION = "The GNU plotting utilities consist of seven command line programs: the \
graphics programs `graph', `plot', `tek2plot', and `plotfont', and the \
mathematical programs `spline', `ode', and `double'.  GNU `libplot' is \
distributed with these programs; it is the library on which the \
graphics programs are based. `Libplot' is a function library for \
device-independent two-dimensional vector graphics, including vector \
graphics animations under the X Window System."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.6"

RPM_NAME = "libxmi0-2.6-31.7.aarch64.rpm"
RPM_HASH = "ef8d198f44586271dc59f53515d9d78491cc34ededba257d4deb862955f78a42d10d642a38a2decc0204d05658834f165f31725b354e3245e9e892bddf09fb5d"

RPROVIDES:${PN} += "libxmi.so.0 \
libxmi0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
