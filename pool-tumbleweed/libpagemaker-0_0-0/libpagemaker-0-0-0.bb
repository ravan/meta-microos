SUMMARY = "A library to import Adobe PageMaker documents"
DESCRIPTION = "libpagemaker is library providing ability to interpret and import \
Adobe PageMaker documents into various applications."
LICENSE = "MPL-2.0"

PV = "0.0.4"

RPM_NAME = "libpagemaker-0_0-0-0.0.4-1.40.aarch64.rpm"
RPM_HASH = "224555665bcae4295202ffa475f92d100f282d5a8e20ec6fcf51967b17c0d5201776433c512891fc492f7c176e28249475000136bd6162cb43dd231422db1921"

RPROVIDES:${PN} += "libpagemaker-0-0-0 \
libpagemaker-0.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
librevenge-0.0.so.0 \
libstdc++.so.6"

inherit rpm
