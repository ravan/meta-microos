SUMMARY = "A collection of plugins for pantheon-calendar"
DESCRIPTION = "Calendar for the Pantheon Desktop. \
 \
This package contains a collection of plugins: CalDAV, Google and etc."
LICENSE = "GPL-3.0-or-later"

PV = "8.0.2"

RPM_NAME = "pantheon-calendar-plugins-8.0.2-1.1.aarch64.rpm"
RPM_HASH = "eec1afea4231e8cf0e5d615b2c6c294160ee98b1aec5977e653d69506833964f00c6a78f5a13a8f5a175a82efc8a1d488c7f1021349be352df7b05aa00f0f986"

RPROVIDES:${PN} += "libcaldav.so \
libgoogle.so \
libweb.so \
pantheon-calendar-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libedataserver-1.2.so.27 \
libelementary-calendar.so.0 \
libgee-0.8.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0 \
pantheon-calendar"

inherit rpm
