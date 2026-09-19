SUMMARY = "Shared library for the profanity console-based XMPP client"
DESCRIPTION = "Profanity is a console-based XMPP client written in C using ncurses, and \
inspired by Irssi. \
 \
This package contains the shared library used by the profanity client and \
plug-ins."
LICENSE = "SUSE-GPL-3.0+-with-openssl-exception"

PV = "0.18.2"

RPM_NAME = "libprofanity0-0.18.2-1.3.aarch64.rpm"
RPM_HASH = "d8fdb8a8ee1af85d9baec3db1c7a66e87999737b08e53a1425f27d98767b31208e0e5e90a35884b8fd139968a314ecb6aad95ee2c2ec5458b1fcddf376db5109"

RPROVIDES:${PN} += "libprofanity.so.0 \
libprofanity0"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
