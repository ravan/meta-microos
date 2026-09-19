SUMMARY = "Network UPS Tools (Uninterruptible Power Supply Monitoring)"
DESCRIPTION = "Network UPS Tools is a collection of programs which provide a common \
interface for monitoring and administering UPS hardware."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.5"

RPM_NAME = "nut-devel-2.8.5-2.2.aarch64.rpm"
RPM_HASH = "0095077d2a6d0efc6f488ecf1e734e516b5a76791f7b444aa127ce28cf5fce855ccd17fb51030565a8656bac8345db1a51b24184a6105cbb4df13fa1b1b326c3"

RPROVIDES:${PN} += "nut-devel \
pkgconfig-libnutclient \
pkgconfig-libnutclientstub \
pkgconfig-libnutconf \
pkgconfig-libnutscan \
pkgconfig-libupsclient"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3.13 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnutclient2 \
libnutclientstub1 \
libnutconf0 \
libnutprivate-2-8-5-common-all.so.1 \
libnutscan4 \
libupsclient7 \
pkgconfig-openssl \
python-abi"

inherit rpm
