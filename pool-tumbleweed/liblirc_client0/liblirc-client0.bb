SUMMARY = "LIRC client library"
DESCRIPTION = "The LIRC client library. To actually use LIRC the lircd daemon from \
the 'lirc' package has to be configured and started."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.2"

RPM_NAME = "liblirc_client0-0.10.2-2.5.aarch64.rpm"
RPM_HASH = "fae0283b57dd620e00857bd4e73facb96f3f0beffbd2d7e792669d15379565a10ee47cfcec16cd03dacea4ad3eadd6b27d93f130116defc83929e9f25c7a4774"

RPROVIDES:${PN} += "liblirc-client.so.0 \
liblirc-client0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
