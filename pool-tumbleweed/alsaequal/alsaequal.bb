SUMMARY = "Equalizer plugin for ALSA"
DESCRIPTION = "Alsaequal is a real-time adjustable equalizer plugin for ALSA"
LICENSE = "LGPL-2.1-only"

PV = "0.7.1"

RPM_NAME = "alsaequal-0.7.1-2.19.aarch64.rpm"
RPM_HASH = "28c992386130e4dfd66cb3db40a7f51a7a5788282e3eee4d2c53e6f2c54dc591790db670e84d412b30d8c090e09b43ab5399f3fff3b723d1aa78cafdc6a4389d"

RPROVIDES:${PN} += "alsaequal \
config-alsaequal \
libasound-module-ctl-equal.so \
libasound-module-pcm-equal.so"

RDEPENDS:${PN} += "ladspa-caps \
libc.so.6"

inherit rpm
