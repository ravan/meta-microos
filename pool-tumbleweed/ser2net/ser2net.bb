SUMMARY = "Serial port to network proxy"
DESCRIPTION = "ser2net provides a way for a user to connect from a network connection to a \
serial port. It provides all the serial port setup, a configuration file to \
configure the ports, a control login for modifying port parameters, \
monitoring ports, and controlling ports."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.8"

RPM_NAME = "ser2net-4.6.8-1.1.aarch64.rpm"
RPM_HASH = "7d670bc142487f4a692584e46dab6d6f9825282cd5ce148112e72ec9129a231ec2be07a18a0c23ea7fb11dd3616fbb53d11bb95bb191d8a10930dc81c7597c42"

RPROVIDES:${PN} += "config-ser2net \
ser2net"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libgensio.so.14 \
libgensiomdns.so.14 \
libgensioosh.so.14 \
libyaml-0.so.2 \
systemd"

inherit rpm
