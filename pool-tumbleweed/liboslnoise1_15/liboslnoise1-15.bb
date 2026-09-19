SUMMARY = "OpenShadingLanguage's image noise generation library"
DESCRIPTION = "Open Shading Language (OSL) is a language for programmable shading \
in advanced renderers and other applications, ideal for describing \
materials, lights, displacement, and pattern generation."
LICENSE = "BSD-3-Clause"

PV = "1.15.4.0"

RPM_NAME = "liboslnoise1_15-1.15.4.0-3.1.aarch64.rpm"
RPM_HASH = "c55335e77bfbd6fd4da6b9488e1f553c9830415d423ee7cf28593e8568b87f6ebf23a4f1fc2588c199137e3673194fde35648d6f7b3767203f8f7a19167f5661"

RPROVIDES:${PN} += "liboslnoise.so.1.15 \
liboslnoise1-15"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
