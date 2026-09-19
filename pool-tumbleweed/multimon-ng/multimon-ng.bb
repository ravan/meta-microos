SUMMARY = "A fork of multimon that decodes multiple digital transmission modes"
DESCRIPTION = "MultimonNG a fork of multimon. It decodes the following digital transmission modes: \
* POCSAG512 POCSAG1200 POCSAG2400 \
* EAS \
* UFSK1200 CLIPFSK AFSK1200 AFSK2400 AFSK2400_2 AFSK2400_3 \
* HAPN4800 \
* FSK9600 \
* DTMF \
* ZVEI1 ZVEI2 ZVEI3 DZVEI PZVEI \
* EEA EIA CCIR \
* MORSE CW \
* FLEX"
LICENSE = "GPL-2.0-only"

PV = "1.6.0"

RPM_NAME = "multimon-ng-1.6.0-1.1.aarch64.rpm"
RPM_HASH = "699086ab191544bc4adf3e9e5c1457f8a93f89c30ba062f9055ac42ba647cf842371c547151fd037b6b6c47d6f19f28b7b6a50a5cab82eaf40499082d3a0fda8"

RPROVIDES:${PN} += "multimon-ng"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL3.so.0 \
libX11.so.6 \
libc.so.6 \
libm.so.6 \
libpulse-simple.so.0 \
libpulse.so.0"

inherit rpm
