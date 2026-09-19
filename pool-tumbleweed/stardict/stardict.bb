SUMMARY = "A powerful cross-platform dictionary written in GTK+3"
DESCRIPTION = "StarDict is a cross-platform and international dictionary written in GTK+3. \
 \
It has features such as 'Glob-style pattern matching', 'Scan \
selection word' and 'Fuzzy query'."
LICENSE = "GPL-3.0-only"

PV = "3.0.7"

RPM_NAME = "stardict-3.0.7-3.3.aarch64.rpm"
RPM_HASH = "877c132934a621806da927c0805353d6cdf17576eada133b142642e35f0bff8cc82285648f4b4bf7c948c1c47229201cf73d880f570cd2ce231e94e16b79e9f9"

RPROVIDES:${PN} += "stardict"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcanberra-gtk3.so.0 \
libcanberra.so.0 \
libenchant.so.1 \
libespeak-ng.so.1 \
libflite-cmu-time-awb.so.1 \
libflite-cmu-us-awb.so.1 \
libflite-cmu-us-kal.so.1 \
libflite-cmu-us-kal16.so.1 \
libflite-cmu-us-rms.so.1 \
libflite-cmu-us-slt.so.1 \
libflite.so.1 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libjson-glib-1.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libsigc-2.0.so.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
