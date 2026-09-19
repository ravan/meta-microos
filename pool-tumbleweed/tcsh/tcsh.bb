SUMMARY = "The C SHell"
DESCRIPTION = "Tcsh is an enhanced, but completely compatible, version of the Berkeley \
UNIX C shell, csh(1). It is a command language interpreter usable as an \
interactive login shell and a shell script command processor. It \
includes a command-line editor, programmable word completion, spelling \
correction, a history mechanism, job control, and a C-like syntax."
LICENSE = "BSD-3-Clause"

PV = "6.24.16"

RPM_NAME = "tcsh-6.24.16-1.6.aarch64.rpm"
RPM_HASH = "453bdc3c4186e8206ec84de21788ec30082e2b45c4851a7b9bddec692466b70b877f86f6609d14cb0eaa133365dafc32af3ef1d3936c89af65b47ea22831ff73"

RPROVIDES:${PN} += "/usr/bin/csh \
config-tcsh \
tcsh"

RDEPENDS:${PN} += "gawk \
hostname \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libtinfo.so.6 \
textutils"

inherit rpm
