SUMMARY = "A SatCom ACARS demodulator and decoder for the Aero standard"
DESCRIPTION = "JAERO is a program that demodulates and decodes Classic Aero ACARS (Aircraft \
Communications Addressing and Reporting System) messages sent from satellites to \
aeroplanes (SatCom ACARS), commonly used when planes are beyond VHF range. \
 \
Demodulation is performed using the soundcard. \
 \
Such signals are typically around 1.5Ghz and can be received with a \
low-gain antenna that can be home-brewed in conjunction with an \
RTL-SDR dongle."
LICENSE = "GPL-3.0-or-later & MIT"

PV = "1.0.4.14"

RPM_NAME = "jaero-1.0.4.14-1.1.aarch64.rpm"
RPM_HASH = "5dddc0b93df4d96480ffef1a69aad0de317862dbb2158aacc4f5efe169ad22bf9b9ac64336b72f93f26bc830983594bbe0560544c0c5d5ac013e83c01c2525d8"

RPROVIDES:${PN} += "jaero"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Network.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libacars-2.so.2 \
libc.so.6 \
libcorrect.so.0.0.0 \
libgcc-s.so.1 \
libm.so.6 \
libogg.so.0 \
libqcustomplot-qt5.so.2 \
libqmqtt-qt5.so.1 \
libstdc++.so.6 \
libvorbis.so.0 \
libvorbisenc.so.2 \
libzmq.so.5 \
unzip"

inherit rpm
