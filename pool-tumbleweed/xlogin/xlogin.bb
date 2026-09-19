SUMMARY = "xlogin, xtelnet"
DESCRIPTION = "This package contains two scripts, which, called with the name of a \
remote host, will open an xterm window on the local X display with a \
remote session or login shell. \
 \
The script xlogin starts by a rsh call (remote shell) an xterm on the \
remote host.  If necessary, the access will be allowed by sending the \
magic key (cookie) of the display to the remote host. \
 \
The script xtelnet starts a local xterm with a telnet session on the \
remote host."
LICENSE = "GPL-2.0-or-later"

PV = "0.2"

RPM_NAME = "xlogin-0.2-223.7.noarch.rpm"
RPM_HASH = "b7e46c54ba843d63f3115803a41f6c29f90a00d697e8774a31199e9f3e86dd47ce4f9f3ab88466bac124e637b96c94b9c5db3692fe5ff931b30d57f8aa192834"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xlogin"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
textutils"

inherit rpm
