SUMMARY = "OfficeBean Java Bean component for LibreOffice"
DESCRIPTION = "With the OfficeBean, a developer can easily write Java applications, \
harnessing the power of LibreOffice. It encapsulates a connection to \
a locally running LibreOffice process, and hides the complexity of \
establishing and maintaining that connection from the developer. \
 \
It also allows embedding of LibreOffice documents within the Java \
environment. It provides an interface the developer can use to obtain \
Java AWT windows into which the backend LibreOffice process draws \
its visual representation. These windows are then plugged into the UI \
hierarchy of the hosting Java application. The embedded document is \
controlled from the Java environment, since the OfficeBean allows \
developers to access the complete LibreOffice API from their Java \
environment giving them full control over the embedded document, its \
appearance and behavior."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-officebean-26.8.0.3-1.1.aarch64.rpm"
RPM_HASH = "3f87279483343ba2dcfdfca5e81da3bdf35fb33dd9384850c94845fa1c15c6519da60f1b08f40100396deb56fc0f77f1878f4b805eeb28ce5986581e2042dccd"

RPROVIDES:${PN} += "libofficebean.so \
libreoffice-officebean"

RDEPENDS:${PN} += "jre \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjawt.so \
libreoffice \
rtld-GNU-HASH"

inherit rpm
