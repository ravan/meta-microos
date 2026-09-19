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

RPM_NAME = "plotutils-2.6-31.7.aarch64.rpm"
RPM_HASH = "5fe70629f9895632f31b96df0e5a4ae20a7f8a601ca59bbde6f5e933b65ec648e0f0744a7390b6fefaa43b6aebbd6c763efd3c3ee3f5c7826a8285cb3741df6a"

RPROVIDES:${PN} += "plotutils"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libplot.so.2 \
libstdc++.so.6 \
perl"

inherit rpm
