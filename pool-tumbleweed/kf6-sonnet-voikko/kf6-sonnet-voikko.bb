SUMMARY = "KDE spell checking library: Support for Voikko"
DESCRIPTION = "Plug-in adding Voikko based spell checking for the Finnish language \
to the Sonnet spell checking framework."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-sonnet-voikko-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "6049882ea9bd20e045c873539367b9803548adbe66f1f56a21eaf4fdd44e40cc43231f11b864ac9641dd42d24ec84b00d2c6e884183b38290f09eb41b0aaed9d"

RPROVIDES:${PN} += "kf6-sonnet-voikko \
locale-sonnet-fi"

RDEPENDS:${PN} += "kf6-sonnet \
ld-linux-aarch64.so.1 \
libKF6SonnetCore.so.6 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6 \
libvoikko.so.1"

inherit rpm
