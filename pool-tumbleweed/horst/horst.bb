SUMMARY = "IEEE 802.11 wireless LAN analyzer"
DESCRIPTION = "horst is an IEEE 802.11 WLAN analyzer with a text interface. Its \
basic function is similar to tcpdump, Wireshark or Kismet, but it \
shows different, aggregated information. It is made for debugging \
wireless LANs with a focus on getting a quick overview instead of \
deep packet inspection and has features for ad-hoc (IBSS) mode and \
mesh networks."
LICENSE = "GPL-2.0-only"

PV = "5.1"

RPM_NAME = "horst-5.1-5.10.aarch64.rpm"
RPM_HASH = "e8885c8a917acc337c5845631400155271b5f227e3629249e5084cf3e6eb32203fbc4a33bc7f4ca6d2d8d883afccef3b32071fb81a21a69857dd144fdef41cc8"

RPROVIDES:${PN} += "config-horst \
horst"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libncursesw.so.6 \
libnl-3.so.200 \
libnl-genl-3.so.200 \
libtinfo.so.6"

inherit rpm
