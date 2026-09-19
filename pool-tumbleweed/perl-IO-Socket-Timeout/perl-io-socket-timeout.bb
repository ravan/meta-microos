SUMMARY = "IO::Socket with read/write timeout"
DESCRIPTION = "'IO::Socket' provides a way to set a timeout on the socket, but the timeout \
will be used only for connection, not for reading / writing operations. \
 \
This module provides a way to set a timeout on read / write operations on \
an 'IO::Socket' instance, or any 'IO::Socket::*' modules, like \
'IO::Socket::INET'."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.32"

RPM_NAME = "perl-IO-Socket-Timeout-0.32-1.39.noarch.rpm"
RPM_HASH = "c1697b333a01a31f35ad95f94166051dc42a203a2e228ad9551b9bc673b8db0ca03cffb4043f928355286c3e9c0c8019b1127b5c9707ce8d365e862fdae1880b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-IO--Socket--Timeout \
perl-IO--Socket--Timeout--Role--PerlIO \
perl-IO--Socket--Timeout--Role--SetSockOpt \
perl-IO-Socket-Timeout"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-PerlIO--via--Timeout"

inherit rpm
