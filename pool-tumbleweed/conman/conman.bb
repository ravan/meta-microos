SUMMARY = "The Console Manager"
DESCRIPTION = "ConMan is a serial console management program designed to support a large \
number of console devices and simultaneous users.  It supports: \
  - local serial devices \
  - remote terminal servers (via the telnet protocol) \
  - IPMI Serial-Over-LAN (via FreeIPMI) \
  - Unix domain sockets \
  - external processes (eg, using Expect for telnet/ssh/ipmi-sol connections) \
 \
Its features include: \
  - logging (and optionally timestamping) console device output to file \
  - connecting to consoles in monitor (R/O) or interactive (R/W) mode \
  - allowing clients to share or steal console write privileges \
  - broadcasting client output to multiple consoles"
LICENSE = "GPL-3.0-or-later"

PV = "0.3.1"

RPM_NAME = "conman-0.3.1-3.8.aarch64.rpm"
RPM_HASH = "f52f20bcccff97f03b4bff9db43c95913be668b28311450c58d3c4a7b0bf47e70925031cf3ffa126d39bd7ba66cbc80cf8e8dce6ebc0e78813737327865aebf4"

RPROVIDES:${PN} += "config-conman \
conman \
group-conman \
user-conman"

RDEPENDS:${PN} += "/usr/bin/expect \
/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/sh \
/usr/bin/touch \
coreutils \
expect \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libwrap.so.0 \
logrotate \
sed \
shadow \
systemd"

inherit rpm
