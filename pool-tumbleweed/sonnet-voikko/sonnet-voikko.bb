SUMMARY = "KDE spell checking library: Support for Voikko"
DESCRIPTION = "Plug-in adding Voikko based spell checking for the Finnish language \
to the Sonnet spell checking framework."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "sonnet-voikko-5.116.0-3.2.aarch64.rpm"
RPM_HASH = "f66c1fe30e28c05a0a641ac86370511b29c80f22aafc259a0fb90da64ae7488761c542e7abe51f98516d22e7925dfacd97031010ebfade2b61793ba73878826f"

RPROVIDES:${PN} += "locale-sonnet-fi \
sonnet-voikko"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5SonnetCore.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6 \
libvoikko.so.1 \
sonnet"

inherit rpm
