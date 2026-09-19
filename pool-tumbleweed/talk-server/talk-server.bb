SUMMARY = "Talk Daemon to Chat with Another User"
DESCRIPTION = "This package contains the talk daemon, which allows you to chat with \
another user on a different system. Talk is a communication program \
which copies lines from one terminal to the terminal of another user."
LICENSE = "BSD-3-Clause"

PV = "0.17"

RPM_NAME = "talk-server-0.17-723.10.aarch64.rpm"
RPM_HASH = "f679c2643fa29a4adec76bb8ec4eed76c662883a31eb827cdc9ab804cefc9f230aef51d2685fd92566f37792e036b12a26052e982f40fa98dd2f4decbc274fe4"

RPROVIDES:${PN} += "nkitserv-/usr/sbin/in.talkd \
talk-server"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnss-usrfiles2 \
net-tools \
netcfg \
systemd"

inherit rpm
