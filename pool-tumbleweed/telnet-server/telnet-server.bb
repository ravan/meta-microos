SUMMARY = "A Server Program for the Telnet Remote Login Protocol"
DESCRIPTION = "Telnet is a popular protocol for logging into remote systems. This \
package provides the telnet daemon, which will allow remote logins into \
this machine."
LICENSE = "BSD-3-Clause"

PV = "1.2"

RPM_NAME = "telnet-server-1.2-177.10.aarch64.rpm"
RPM_HASH = "712bae3777905bcc9164363559be9858631d87e1249c0fb731815a0599a253dcd809fc01697d3a7550334ef930ac95f59adb043f9c205d42b57f39012d45def5"

RPROVIDES:${PN} += "nkitserv-/usr/sbin/in.telnetd \
telnet-server"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnss-usrfiles2 \
libtinfo.so.6 \
netcfg \
systemd"

inherit rpm
