SUMMARY = "Full Java CommAPI implementation native library"
DESCRIPTION = "RxTx is a Java library, using a native implementation (via JNI), providing serial \
and parallel communication for the Java Development Toolkit (JDK). It is based on \
the specification for Sun's Java Communications API."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2~pre2"

RPM_NAME = "librxtx2-2.2~pre2-10.1.aarch64.rpm"
RPM_HASH = "bfd39130ba652db3f9f9b7ff516f41f04fd212c1d24450b74461c8f8d4e5452b1e7123392b92098321472043c2c66775fd23676738bd1c526d6485417e1a5704"

RPROVIDES:${PN} += "librxtx2 \
librxtxI2C-2.2pre2.so \
librxtxParallel-2.2pre2.so \
librxtxRS485-2.2pre2.so \
librxtxRaw-2.2pre2.so \
librxtxSerial-2.2pre2.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
