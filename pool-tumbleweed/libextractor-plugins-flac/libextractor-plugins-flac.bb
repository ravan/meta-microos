SUMMARY = "The 'flac' libextractor plugin"
DESCRIPTION = "This package ships the 'flac' plugin for libextractor."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.14"

RPM_NAME = "libextractor-plugins-flac-1.14-1.2.aarch64.rpm"
RPM_HASH = "772489cbcd515db0a3ef04dce96ceb65291ea8f5e490a2fbfb17a4960107f165feab7eb92f0dc8775e1a5d1f17e5925121cfc23b0ea59e958fb772e1480c0660"

RPROVIDES:${PN} += "libextractor-flac.so \
libextractor-plugins-flac"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libFLAC.so.14 \
libc.so.6"

inherit rpm
