SUMMARY = "A GTK-Based Graphical Scanning Front-End for SANE"
DESCRIPTION = "XSane does not support any scanners itself. XSane uses the SANE library \
to talk to scanners that are supported by SANE. \
 \
XSane is designed for acquiring images with scanners (there are other \
devices like cameras and video devices supported by SANE, but XSane is \
not designed for that purpose). You can scan to file, make a photocopy, \
create a fax, and start XSane from the GIMP as a GIMP plug-in. \
 \
XSane may not work correctly or you may not be able to take full \
advantage of all functions if you do not configure XSane correctly. See \
the documentation at /usr/share/sane/xsane/doc/sane-xsane-doc.html. \
 \
The XSane home page is http://www.xsane.org/."
LICENSE = "GPL-2.0-or-later"

PV = "0.999"

RPM_NAME = "xsane-0.999-8.3.aarch64.rpm"
RPM_HASH = "31c3f34cd3c7a4162b606b40bf0a447249d911840feadaef873e3f522e7120f6cc99069080e78d562f321c49a3711e08bcfad86a1ac3b9c19252d03bc0c33137"

RPROVIDES:${PN} += "gimp-2.0-scanner-plugin \
xsane"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libjpeg.so.8 \
liblcms2.so.2 \
libm.so.6 \
libpng16.so.16 \
libsane.so.1 \
libtiff.so.6 \
libz.so.1 \
sane-backends \
xdg-utils"

inherit rpm
