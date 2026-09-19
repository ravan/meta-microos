SUMMARY = "Applet for adjusting external monitors"
DESCRIPTION = "A small applet for adjusting external monitors. Utilising the DDC/CI protocol."
LICENSE = "GPL-3.0-only"

PV = "0.1.0+git20240704.13b212d"

RPM_NAME = "cosmic-ext-applet-external-monitor-brightness-0.1.0+git20240704.13b212d-2.13.aarch64.rpm"
RPM_HASH = "ae9a23dbf152fba17ef1712bffb190b2dca7aa7756eb188957c1c2663173b8fb28ac74c88b406b343824f539193fe06fd452de43f1e1cda11c53f2ae03567f7a"

RPROVIDES:${PN} += "cosmic-ext-applet-external-monitor-brightness"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libudev.so.1 \
libxkbcommon.so.0"

inherit rpm
