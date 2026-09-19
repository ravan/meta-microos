SUMMARY = "OpenVPN down-root plugin"
DESCRIPTION = "The OpenVPN down-root plugin allows an OpenVPN configuration to call a \
down script with root privileges, even when privileges have been \
dropped using --user/--group/--chroot. \
 \
This module uses a split privilege execution model which will fork() \
before OpenVPN drops root privileges, at the point where the --up \
script is usually called.  The plugin will then remain in a wait state \
until it receives a message from OpenVPN via pipe to execute the down \
script.  Thus, the down script will be run in the same execution \
environment as the up script."
LICENSE = "GPL-2.0-only-with-openvpn-openssl-exception"

PV = "2.7.5"

RPM_NAME = "openvpn-down-root-plugin-2.7.5-1.1.aarch64.rpm"
RPM_HASH = "feb769dd67a58d2688585e1bee488898b84bfc4fc2f53290fa81be60d28bba5aa25132289d1312bc97ff2c8c417e6a8f15bd77a3d12ddc3c8e17c9bfe9bfade7"

RPROVIDES:${PN} += "openvpn-down-root-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
openvpn"

inherit rpm
