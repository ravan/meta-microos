SUMMARY = "Satellite tracking and orbital prediction"
DESCRIPTION = "PREDICT is a multi-user satellite tracking and orbital prediction program. \
Beyond displaying data, it can operate antenna rotators."
LICENSE = "GPL-2.0-or-later"

PV = "2.3.1"

RPM_NAME = "predict-2.3.1-2.5.aarch64.rpm"
RPM_HASH = "71f9ab934bf9deb924d253d763060885d8273b726efb94df942cfe27b3b7c97c9c6b235c463bde7411a3de1873f75ce90ba6ba6c16651b7827fd93aa7214b65d"

RPROVIDES:${PN} += "predict"

RDEPENDS:${PN} += "/usr/bin/bash \
libasound.so.2 \
libc.so.6 \
libm.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
