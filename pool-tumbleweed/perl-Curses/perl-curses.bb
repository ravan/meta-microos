SUMMARY = "Terminal screen handling and optimization"
DESCRIPTION = "'Curses' is the interface between Perl and your system's curses(3) library. \
For descriptions on the usage of a given function, variable, or constant, \
consult your system's documentation, as such information invariably varies \
(:-) between different curses(3) libraries and operating systems. This \
document describes the interface itself, and assumes that you already know \
how your system's curses(3) library works."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.460.0"

RPM_NAME = "perl-Curses-1.460.0-1.5.aarch64.rpm"
RPM_HASH = "c0709f36f7510db4792eec6f5954bd5a4257ab833df8388c37936a2ae8aaea6d951017377974ccb54ddb54e364014940bf920066ea270dd16311c2333a5e6a81"

RPROVIDES:${PN} += "perl-Curses \
perl-Curses--Field \
perl-Curses--Form \
perl-Curses--Item \
perl-Curses--Menu \
perl-Curses--Panel \
perl-Curses--Screen \
perl-Curses--Window"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libform.so.6 \
libmenu.so.6 \
libncursesw.so.6 \
libpanel.so.6 \
libtinfo.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
