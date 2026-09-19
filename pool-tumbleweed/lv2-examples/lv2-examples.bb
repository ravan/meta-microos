SUMMARY = "LV2 example plugins"
DESCRIPTION = "LV2 is a plugin standard for audio systems, similar in scope to LADSPA, \
VST, AU, and others. It defines a C API for code and a format for data files \
which collectively describe a plugin. LV2 consists of a core (roughly \
equivalent in power to LADSPA) which can be extended to support more \
functionality. \
This package contains LV2 example plugins."
LICENSE = "ISC"

PV = "1.18.10"

RPM_NAME = "lv2-examples-1.18.10-3.11.aarch64.rpm"
RPM_HASH = "d4338e36ae9d26bfd4c2d86b765af86ac7c4992e4cae7446ad476b4d2dcec57aeeea080551cb08beecb0cf344588206157f15a292e301796c1ac29473ad8edf7"

RPROVIDES:${PN} += "lv2-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libm.so.6 \
libsamplerate.so.0 \
libsndfile.so.1 \
lv2"

inherit rpm
