SUMMARY = "A org.freedesktop.impl.portal.Secret implementation"
DESCRIPTION = "An implementation of org.freedesktop.impl.portal.Secret."
LICENSE = "MIT"

PV = "0.4.3"

RPM_NAME = "oo7-portal-0.4.3-2.8.aarch64.rpm"
RPM_HASH = "ff15110919e085ba751b7a7ad387370cb0e1bf51568bc8a8b76eed35677e869fa1d0b5414c37cd8002aa3e0503d8ada823f049aba8e1488d12332de6dcbc6253"

RPROVIDES:${PN} += "dbus-org.freedesktop.impl.portal.Secret \
dbus-org.freedesktop.impl.portal.desktop.oo7 \
oo7-portal"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
