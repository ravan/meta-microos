SUMMARY = "A Razer device configuration tool"
DESCRIPTION = "Razercfg is the next generation Razer device configuration \
tool bringing the Razer gaming experience to the free Open Source world. \
Including commandline tool (razercfg) and QT GUI qrazercfg."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-or-later"

PV = "0.44"

RPM_NAME = "razercfg-0.44-1.1.aarch64.rpm"
RPM_HASH = "281fe62a168320a9ce6d48bb103e3b2bacf57ab9d9f8cf0f3b585dcf0b859ac56ec7788173d92618267dac1d5054d6ec2ee0712f074796f32aa1236a13e8abda"

RPROVIDES:${PN} += "librazer.so.1 \
python3.13dist-razercfg \
python3dist-razercfg \
razercfg"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0 \
python-abi \
python3-qt6"

inherit rpm
