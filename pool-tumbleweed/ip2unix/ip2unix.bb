SUMMARY = "Turn IP sockets into Unix domain sockets"
DESCRIPTION = "Executes a program and converts IP to Unix domain sockets at runtime based on a \
list of rules, either given via short command line options or via a file with a \
list of rules. The first matching rule causes ip2unix to replace the current IP \
socket with a Unix domain socket based on the options given. For example if a \
socketPath is specified, the Unix domain socket will bind or listen to the given \
path."
LICENSE = "LGPL-3.0-only"

PV = "2.2.2"

RPM_NAME = "ip2unix-2.2.2-1.3.aarch64.rpm"
RPM_HASH = "338623965c302c6ca5955275804d6aa576f2ea518096f3522a84910672526ca50e859b9b30df7d8d5bda23b1d135d5cbf68b8fb1b3b9eafeb0d8cd597b65a9a9"

RPROVIDES:${PN} += "ip2unix \
libip2unix.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libyaml-cpp.so.0.9"

inherit rpm
