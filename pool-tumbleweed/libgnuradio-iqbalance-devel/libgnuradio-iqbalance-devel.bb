SUMMARY = "Development files for gr-iqbal"
DESCRIPTION = "Library headers for gr-iqbal, I/Q balancing for GNU Radio"
LICENSE = "GPL-2.0-only"

PV = "0.39.0git20250425"

RPM_NAME = "libgnuradio-iqbalance-devel-0.39.0git20250425-1.5.aarch64.rpm"
RPM_HASH = "b57907ed14a35b1b151e10a258715f4b1ed197ff9e8fd9394097edc9034cf21ff643da7202b69cc1b650b05814e8847c31cae8a01d4387b9c7e061532199af6f"

RPROVIDES:${PN} += "cmake-gnuradio-iqbalance \
libgnuradio-iqbalance-devel"

RDEPENDS:${PN} += "libgnuradio-iqbalance3-9-0"

inherit rpm
