SUMMARY = "An automatic X screen-locker/screen-saver"
DESCRIPTION = "Xautolock monitors console activity under the X window system, and fires up a \
program of your choice if nothing happens during a user configurable period of \
time. You can use this to automatically start up a screen locker in case you \
tend to forget to do so manually before having a coffee break."
LICENSE = "GPL-2.0"

PV = "2.2"

RPM_NAME = "xautolock-2.2-3.9.aarch64.rpm"
RPM_HASH = "83eb282890ebfe796fbdc268a68368b95da79231c367708b4af2bc90f7520efbe3d9202dd13ad3f4b0a495a5d4252f9fb62fefe564f1501b75e68b8e15830c38"

RPROVIDES:${PN} += "xautolck \
xautolock"

RDEPENDS:${PN} += "libX11.so.6 \
libXss.so.1 \
libc.so.6"

inherit rpm
