SUMMARY = "An example tools to forward localhost ports to iOS devices"
DESCRIPTION = "'usbmuxd' stands for 'USB multiplexing daemon'. This daemon is in charge of \
multiplexing connections over USB to an iPhone or iPod touch. To users, it means \
you can sync your music, contacts, photos, etc. over USB. To developers, it \
means you can connect to any listening localhost socket on the device. usbmuxd \
is not used for tethering data transfer, which uses a dedicated USB interface as \
a virtual network device. \
 \
Multiple connections to different TCP ports can happen in parallel. An example \
(and useful) tool called 'iproxy' is included that allows you to forward \
localhost ports to the device---allows SSH over USB on jailbroken devices, or \
allowing access the lockdown daemon (and then to all of the file access, sync, \
notification and backup services running on the device)."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "2.1.0"

RPM_NAME = "libusbmuxd-tools-2.1.0-1.7.aarch64.rpm"
RPM_HASH = "16c14baf0601a2d35ebae4c159c241f0d9e594b62d47083f55aace7a65cd732b52cdb6836140e45135161527dc8448bb3720109133d5f161b80e26890055ecdc"

RPROVIDES:${PN} += "iproxy \
libusbmuxd-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libimobiledevice-glue-1.0.so.0 \
libusbmuxd-2.0.so.7"

inherit rpm
