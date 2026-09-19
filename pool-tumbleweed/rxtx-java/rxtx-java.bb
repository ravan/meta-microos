SUMMARY = "Full Java CommAPI implementation"
DESCRIPTION = "RxTx is a Java library, using a native implementation (via JNI), providing serial \
and parallel communication for the Java Development Toolkit (JDK). It is based on \
the specification for Sun's Java Communications API."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2~pre2"

RPM_NAME = "rxtx-java-2.2~pre2-10.1.aarch64.rpm"
RPM_HASH = "27ed21d2a2e2c382708bd25799054a768d9e6c255124211a930642953c543e3bbd6f11cc1c819738de14ce23ab744a451c14e3ab4c06902554ed744b98dce3f4"

RPROVIDES:${PN} += "osgi-gnu.io.rxtx \
rxtx-java"

RDEPENDS:${PN} += "librxtx2"

inherit rpm
