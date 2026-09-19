SUMMARY = "Network UPS Tools Core (Uninterruptible Power Supply Monitoring)"
DESCRIPTION = "Core package of Network UPS Tools. \
 \
Network UPS Tools is a collection of programs which provide a common \
interface for monitoring and administering UPS hardware."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.5"

RPM_NAME = "nut-2.8.5-2.2.aarch64.rpm"
RPM_HASH = "da4055214a00a8f7f7f47542f97e58a2151c0337f2555b3a9ca384318771b11cba18a7c45d661b0fcee833ae634193c9e88574e292bc6c907f328c023603839e"

RPROVIDES:${PN} += "config-nut \
libnutprivate-2-8-5-common-all.so.1 \
libnutprivate-2-8-5-common-client.so.1 \
libnutprivate-2-8-5-drivers-common.so.1 \
libnutprivate-2-8-5-drivers-libusb.so.1 \
libnutprivate-2-8-5-drivers-serial.so.1 \
nut \
nut-classic"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
group-daemon \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpiod.so.3 \
libi2c.so.0 \
libm.so.6 \
libmodbus.so.5 \
libnutconf.so.0 \
libnutscan.so.4 \
libpowerman.so.0 \
libssl.so.3 \
libstdc++.so.6 \
libsystemd.so.0 \
libupsclient.so.7 \
libusb-1.0.so.0 \
logrotate \
python-abi \
systemd \
udev \
usbutils \
user-upsd"

inherit rpm
