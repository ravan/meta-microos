SUMMARY = "Access the terminfo database"
DESCRIPTION = "Objects in this class provide access to _terminfo_ database entires. \
 \
This database provides information about a terminal, in three separate sets \
of capabilities. Flag capabilities indicate the presence of a particular \
ability, feature, or bug simply by their presence. Number capabilities give \
the size, count or other numeric detail of some feature of the terminal. \
String capabilities are usually control strings that the terminal will \
recognise, or send. \
 \
Capabilities each have two names; a short name called the capname, and a \
longer name called the varname. This class provides two sets of methods, \
one that works on capnames, one that work on varnames. \
 \
This module optionally uses _unibilium_ to access the terminfo(5) database, \
if it is available at compile-time. If not, it will use _<term.h>_ and \
_-lcurses_. For more detail, see the SEE ALSO section below."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.09"

RPM_NAME = "perl-Term-Terminfo-0.09-2.11.aarch64.rpm"
RPM_HASH = "bf93b945d5815dd6e9457f8095dd793973cecb1eccbcfa991727401d061a2d288cb4f9cbe451aef2663dccef7f6ef25a77d854039393d6a663c58a5bcae5e228"

RPROVIDES:${PN} += "perl-Term--Terminfo \
perl-Term-Terminfo"

RDEPENDS:${PN} += "libc.so.6 \
libtinfo.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
