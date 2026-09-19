SUMMARY = "Use a modifier key as another key"
DESCRIPTION = "xcape allows you to use a modifier key as another key when pressed and released \
on its own. The default behaviour is to generate the Escape key when Left Control \
is pressed and released on its own."
LICENSE = "GPL-3.0"

PV = "1.2"

RPM_NAME = "xcape-1.2-1.19.aarch64.rpm"
RPM_HASH = "03b1154f468e032f92eeceafe038807dbbbcc97cd556689778f699995163eed8b39e16cd9a8db6ad562d679a11bb569f8749816e7a64ab9e50f6431e9b85e6e7"

RPROVIDES:${PN} += "xcape"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXtst.so.6 \
libc.so.6"

inherit rpm
