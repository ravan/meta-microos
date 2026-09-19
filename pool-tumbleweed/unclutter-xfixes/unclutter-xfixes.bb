SUMMARY = "A rewrite of unclutter using the x11-xfixes extension"
DESCRIPTION = "This is a rewrite of the popular tool unclutter, but using the x11-xfixes \
extension. This means that this rewrite doesn't use fake windows or pointer \
grabbing and hence causes less problems with window managers and/or applications."
LICENSE = "MIT"

PV = "1.6"

RPM_NAME = "unclutter-xfixes-1.6-1.11.aarch64.rpm"
RPM_HASH = "1afb9e5e2f7f36617bb800e82eeb27db1f0dc37f2679ab9724c842dbcf8e4f923f3a8e0c5fdd60cc25d46daf227a835a8b9a6849564b4d5d33369b0276eb3a2d"

RPROVIDES:${PN} += "unclutter-xfixes"

RDEPENDS:${PN} += "libX11.so.6 \
libXfixes.so.3 \
libXi.so.6 \
libc.so.6 \
libev.so.4"

inherit rpm
