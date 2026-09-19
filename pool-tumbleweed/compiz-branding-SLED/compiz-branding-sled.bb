SUMMARY = "OpenGL window and compositing manager"
DESCRIPTION = "Compiz is an OpenGL compositing manager that uses \
GLX_EXT_texture_from_drawable for binding redirected top-level \
windows to texture objects. It has a flexible plug-in system and it \
is designed to run well on most graphics hardware."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "0.8.18"

RPM_NAME = "compiz-branding-SLED-0.8.18-4.5.aarch64.rpm"
RPM_HASH = "65a9e7443fc515883cf541c9acd5d1fa1c7f2504116508dd4bec88994fd450acb14eda297ecf8724639e3f5187f468e503e0b1018a055fe297e1291405112179"

RPROVIDES:${PN} += "compiz-branding \
compiz-branding-SLE \
compiz-branding-SLED"

RDEPENDS:${PN} += "/usr/bin/ln \
/usr/bin/rm \
/usr/bin/sh \
compiz"

inherit rpm
