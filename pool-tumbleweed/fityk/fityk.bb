SUMMARY = "Non-linear curve fitting and data analysis"
DESCRIPTION = "Fityk is a program for nonlinear curve-fitting of analytical \
functions (especially peak-shaped) to data (usually experimental \
data). It can also be used for visualization of x-y data only."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "fityk-1.3.2-2.6.aarch64.rpm"
RPM_HASH = "f7c21897cdee1e26f6b116cc0dc1e7056cb1df3553950564ccf59fa5121be9ea48fcfbeb6ed5eb98ce304e69198fec48c6f2d256981d4d982f1d10f1aaec21af"

RPROVIDES:${PN} += "fityk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfityk.so.4 \
libgcc-s.so.1 \
libm.so.6 \
libnlopt.so.1 \
libstdc++.so.6 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk3u-core-suse.so.16.0.0 \
libwx-gtk3u-stc-suse.so.16.0.0 \
libxy.so.3"

inherit rpm
