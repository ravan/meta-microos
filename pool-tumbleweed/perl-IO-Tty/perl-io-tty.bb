SUMMARY = "Pseudo ttys and constants"
DESCRIPTION = "'IO::Tty' is used internally by IO::Pty to create a pseudo-tty. You \
wouldn't want to use it directly except to import constants, use IO::Pty. \
For a list of importable constants, see IO::Tty::Constant. \
 \
Windows is now supported under the Cygwin environment, see \
http://cygwin.com/. \
 \
Please note that pty creation is very system-dependent. Any modern POSIX \
system should be fine. The test suite is run via GitHub Actions CI on \
Linux, macOS, FreeBSD, OpenBSD, and NetBSD. \
 \
If you have problems on your system and it is listed below, you probably \
have a non-standard setup, e.g. you compiled your Linux-kernel yourself and \
disabled ptys (bummer!). Please ask your friendly sysadmin for help. \
 \
If your system is not listed, unpack the latest version of 'IO::Tty', do a \
''perl Makefile.PL; make; make test; uname -a'' and report issues at \
https://github.com/cpan-authors/IO-Tty/issues."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.310.0"

RPM_NAME = "perl-IO-Tty-1.310.0-1.4.aarch64.rpm"
RPM_HASH = "5fff94824397d771ad00b5cd52e5d71792ff802fe3046fff1214f5c1130ba2df9735cac89d6fcf2d338b3983e68b3ffed5d7fdc9d27f309361262264a4b8580c"

RPROVIDES:${PN} += "perl-IO--Pty \
perl-IO--Tty \
perl-IO--Tty--Constant \
perl-IO-Tty"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
