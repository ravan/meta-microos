SUMMARY = "A tool for analysing captured signals from SDRs"
DESCRIPTION = "A tool for analysing captured signals, primarily from software-defined radio receivers"
LICENSE = "GPL-3.0-or-later"

PV = "0.4.0"

RPM_NAME = "inspectrum-0.4.0-2.1.aarch64.rpm"
RPM_HASH = "a51ad1ab68146eb4b3546ec08abeba30283d44618a1a05d7a0c1ca6345678b97687de6969feee13cab3605637c2ebde1ca232d10b84e2e6dae682e888139af67"

RPROVIDES:${PN} += "inspectrum"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libliquid.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
