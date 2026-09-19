SUMMARY = "Remotely open audio channels and a serial port to an Icom transceiver"
DESCRIPTION = "kappanhang remotely opens audio channels and a serial port to an Icom RS-BA1 \
server. The app is mainly developed for connecting to the Icom IC-705 \
transceiver, which has built-in Wi-Fi and RS-BA1 server. All features of the \
protocol are implemented including packet retransmission on packet loss."
LICENSE = "MIT"

PV = "1.3"

RPM_NAME = "kappanhang-1.3-1.10.aarch64.rpm"
RPM_HASH = "092a7e706dcfa7b025679ed6c93477fc25bc49d070af3768d0f2a34dddb6cb60c1c735b466ccc76d5240d581182f8cac94b2c5063f1e2bf797a697dbd149e216"

RPROVIDES:${PN} += "kappanhang"

RDEPENDS:${PN} += "libc.so.6 \
libpulse-simple.so.0 \
libpulse.so.0"

inherit rpm
