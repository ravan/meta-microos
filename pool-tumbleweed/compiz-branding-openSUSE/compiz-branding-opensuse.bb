SUMMARY = "OpenGL window and compositing manager"
DESCRIPTION = "Compiz is an OpenGL compositing manager that uses \
GLX_EXT_texture_from_drawable for binding redirected top-level \
windows to texture objects. It has a flexible plug-in system and it \
is designed to run well on most graphics hardware."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "0.8.18"

RPM_NAME = "compiz-branding-openSUSE-0.8.18-4.5.aarch64.rpm"
RPM_HASH = "a6d0ea21a7bbc377bbe4869a3a710c72f586b7b17afb5283ef486c77819b7ab3be4e9b706af2efa711cafce9ae422127e99afec77524f48e74ce8649c2f1b65b"

RPROVIDES:${PN} += "compiz-branding \
compiz-branding-openSUSE"

RDEPENDS:${PN} += "/usr/bin/ln \
/usr/bin/rm \
/usr/bin/sh \
compiz"

inherit rpm
