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

RPM_NAME = "libplot2-2.6-31.7.aarch64.rpm"
RPM_HASH = "f542b576fd9e3f18cde6b5f5fb49949e7897b4bd4368e92089980eba7b65cab6607b4184e672104a457385e045fbba6303c317aa62bf503ea43e21e2a2c95f32"

RPROVIDES:${PN} += "libplot.so.2 \
libplot2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXext.so.6 \
libXt.so.6 \
libc.so.6 \
libm.so.6 \
libpng16.so.16"

inherit rpm
