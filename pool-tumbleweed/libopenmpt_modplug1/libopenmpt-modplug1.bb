SUMMARY = "Openmpt's libmodplug"
DESCRIPTION = "The ModPlug mod file playing library (emulated via libopenmpt)."
LICENSE = "BSD-3-Clause"

PV = "0.8.9.0"

RPM_NAME = "libopenmpt_modplug1-0.8.9.0-1.22.aarch64.rpm"
RPM_HASH = "74c292318d954aace376ac6c7d474eb4bcbd61d54b1450c2330330ec293033d98fc864a5e26b6f722b28abd007bcf95199f8181b40be5c58c03c0c67609de6b5"

RPROVIDES:${PN} += "libopenmpt-modplug.so.1 \
libopenmpt-modplug1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopenmpt.so.0 \
libstdc++.so.6"

inherit rpm
