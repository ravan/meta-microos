SUMMARY = "Korn Shell"
DESCRIPTION = "The original Korn Shell.  The ksh is an sh-compatible command \
interpreter that executes commands read from standard input or from a \
file. \
 \
 \
 \
Authors: \
-------- \
    David Korn <dgk@research.att.com> \
    Glenn Fowler <gsf@research.att.com> \
    Phong Vo <kpv@research.att.com>"
LICENSE = "CPL-1.0 & EPL-1.0"

PV = "93vu"

RPM_NAME = "ksh-93vu-14.1.aarch64.rpm"
RPM_HASH = "d22676c9733ea5567877ffcf0aa592650a86bcd9a5a3e31fbbdc297b5fc63537752200210bcecbf2102b16460ce571b5b7487ddb3ccc3efcfdb6836a772d8f90"

RPROVIDES:${PN} += "ksh \
libast.so.5 \
libcmd.so.1 \
libdll.so.1 \
libshell.so.1"

RDEPENDS:${PN} += "/etc/bash.bashrc \
/usr/bin/ln \
/usr/bin/rm \
/usr/bin/sh \
/usr/bin/true \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
