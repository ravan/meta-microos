SUMMARY = "Digital signal processing library for software-defined radios"
DESCRIPTION = "liquid-dsp is a signal processing library for software-defined \
radios written in C. Its purpose is to provide a set of extensible DSP modules \
that do no rely on external dependencies or cumbersome frameworks."
LICENSE = "MIT"

PV = "1.8.2"

RPM_NAME = "libliquid1-1.8.2-1.1.aarch64.rpm"
RPM_HASH = "5b5c858d547581708c6cacf7dc58b09a3d380c3068d950e40657a0da357ea1bbf4e560b2fc9b96a725a673fcaf76e6a146e918399a16502b89c144f51a19ed17"

RPROVIDES:${PN} += "libliquid \
libliquid.so.1 \
libliquid1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
