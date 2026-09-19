SUMMARY = "Perl interface to the UNIX syslog(3) calls"
DESCRIPTION = "This module provides an interface to the system logger *syslogd*(8) via \
Perl's XSUBs. The implementation attempts to resemble the native \
libc-functions of your system, so that anyone being familiar with \
_syslog.h_ should be able to use this module right away. \
 \
In contrary to Sys::Syslog(3), this modules does not open a network \
connection to send the messages. This can help you to avoid opening \
security holes in your computer (see 'FAQ'). \
 \
The subs imported by the tag 'macros' are simply wrappers around the most \
important '#defines' in your system's C header file _syslog.h_. The macros \
return integer values that are used to specify options, facilities and \
priorities in a more or less portable way. They also provide general \
information about your local syslog mechanism. Check syslog(3) and your \
local _syslog.h_ for information about the macros, options and facilities \
available on your system."
LICENSE = "Artistic-1.0"

PV = "1.100.0"

RPM_NAME = "perl-Unix-Syslog-1.100.0-1.10.aarch64.rpm"
RPM_HASH = "c1e7dcba22d0cde8113316b54c2e0737466a8679380b5b167952ef34b878bbb1e5a60eb585146b21f1b6fd5fae1d9d7736ff601d0dcae8d94ea5d4feb8ddce68"

RPROVIDES:${PN} += "perl-Unix--Syslog \
perl-Unix-Syslog"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
