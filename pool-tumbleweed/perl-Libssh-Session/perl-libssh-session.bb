SUMMARY = "Perl interface for libssh"
DESCRIPTION = "'Libssh::Session' is a perl interface to the libssh (http://www.libssh.org) \
library. It doesn't support all the library. It's working in progress. \
 \
Right now, you can authenticate and execute commands on a SSH server."
LICENSE = "Apache-2.0"

PV = "1.100.0"

RPM_NAME = "perl-Libssh-Session-1.100.0-1.14.aarch64.rpm"
RPM_HASH = "f396270853d05c1361bb19e4bf3e6a1d5b9f121d7e7bfb137b276375d413d08893c9f6541d44fb6c4984cf93a4e893224b4fc358bbbaee006005b049ffa1cb2a"

RPROVIDES:${PN} += "perl-Libssh--Session \
perl-Libssh--Sftp \
perl-Libssh-Session"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libssh.so.4 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
