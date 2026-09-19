SUMMARY = "Eclipse SWT: The Standard Widget Toolkit for GTK+"
DESCRIPTION = "SWT is an open source widget toolkit for Java designed to provide \
efficient, portable access to the user-interface facilities of the \
operating systems on which it is implemented."
LICENSE = "EPL-2.0"

PV = "4.29"

RPM_NAME = "eclipse-swt-4.29-4.3.aarch64.rpm"
RPM_HASH = "d1331a4bbc41ec31df95d4ceac6fd752271f3d068c4b1ac9fa9a963a8ec37de90fb448284b422c491dc051b20dd926926b28069063b9b3c307239856040c06b4"

RPROVIDES:${PN} += "eclipse-swt \
libswt-atk-gtk-4962r3.so \
libswt-awt-gtk-4962r3.so \
libswt-cairo-gtk-4962r3.so \
libswt-glx-gtk-4962r3.so \
libswt-gtk-4962r3.so \
libswt-pi3-gtk-4962r3.so \
libswt-webkit-gtk-4962r3.so \
mvn-org.eclipse.swt-org.eclipse.swt \
mvn-org.eclipse.swt-swt \
osgi-org.eclipse.swt"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgtk-3.so.0 \
libjawt.so"

inherit rpm
