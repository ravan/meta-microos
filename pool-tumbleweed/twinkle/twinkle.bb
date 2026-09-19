SUMMARY = "A SIP Soft Phone"
DESCRIPTION = "Twinkle is a SIP-based soft phone for making telephone calls over IP \
networks."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.3"

RPM_NAME = "twinkle-1.10.3-5.5.aarch64.rpm"
RPM_HASH = "f6e75729590924493b70140e05d935c5263dff8b93bade2002fc008b801fe77505e9158625f92e487bc1d353cb103612f6cb9242ab0c1c5382ca3d7c0c8e3603"

RPROVIDES:${PN} += "twinkle"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libasound.so.2 \
libbcg729.so.0 \
libc.so.6 \
libccrtp.so.3 \
libcommoncpp.so.8 \
libgcc-s.so.1 \
libgsm.so.1 \
libm.so.6 \
libmagic.so.1 \
libreadline.so.8 \
libresolv.so.2 \
libsndfile.so.1 \
libspeex.so.1 \
libspeexdsp.so.1 \
libstdc++.so.6 \
libucommon.so.8 \
libusecure.so.8 \
libxml2.so.16 \
update-desktop-files"

inherit rpm
