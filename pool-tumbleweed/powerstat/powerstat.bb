SUMMARY = "Laptop power measuring tool"
DESCRIPTION = "Powerstat measures the power consumption of a mobile PC that has a battery \
power source. The output is like vmstat but also shows power consumption \
statistics. At the end of a run, powerstat will calculate the average, \
standard deviation and min/max of the gathered data."
LICENSE = "GPL-2.0-only"

PV = "0.04.03"

RPM_NAME = "powerstat-0.04.03-1.10.aarch64.rpm"
RPM_HASH = "bb08cd8fcbd362f84b26cbbceb1d99d45ede72d9f2e5f3e6006430599745650bb86894d3ef246c5deac85e0f6ffe673f2ee67513953b3f0cc49420584378ef59"

RPROVIDES:${PN} += "powerstat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
