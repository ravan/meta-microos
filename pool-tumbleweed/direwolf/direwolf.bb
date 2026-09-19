SUMMARY = "Software 'soundcard' modem/TNC and APRS"
DESCRIPTION = "Dire Wolf is a software 'soundcard' modem/TNC and APRS * encoder/decoder. It \
can be used stand-alone to receive APRS messages, as a digipeater, APRStt \
lf.desktop \
gateway, or Internet Gateway (IGate). It can also be used as a virtual TNC for \
other applications such as APRSIS32, UI-View32, Xastir, APRS-TW, YAAC, UISS, \
Linux AX25, SARTrack, and many others."
LICENSE = "GPL-2.0-only"

PV = "1.8.1"

RPM_NAME = "direwolf-1.8.1-2.6.aarch64.rpm"
RPM_HASH = "dd74470a145fc19808f9db5f16772de45ea79558868e32ebc2fa81049ac57dc697d6805d8e41c3592052db627fc173ed4bd9a081c0142c6fcda3fe2311f7a03a"

RPROVIDES:${PN} += "direwolf"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libgps.so.32 \
libhamlib.so.4 \
libm.so.6 \
libmvec.so.1 \
libudev.so.1"

inherit rpm
