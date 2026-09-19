SUMMARY = "Xlib-based client API for the XTEST and RECORD extensions"
DESCRIPTION = "The XTEST extension is a minimal set of client and server extensions \
required to completely test the X11 server with no user intervention. \
This extension is not intended to support general journaling and \
playback of user actions. \
 \
The RECORD extension supports the recording and reporting of all core \
X protocol and arbitrary X extension protocol."
LICENSE = "MIT"

PV = "1.2.5"

RPM_NAME = "libXtst6-1.2.5-1.9.aarch64.rpm"
RPM_HASH = "bb41fccbc522a87384b9b9c74a394cae999f1577ab7fb5d2f8e374c3217660c26ff9cef0bebf4c37c5a8596a50c7e7942626009e1068cb0ece92a5fbcecb4c14"

RPROVIDES:${PN} += "libXtst \
libXtst.so.6 \
libXtst6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libc.so.6"

inherit rpm
