SUMMARY = "OpenGL window and compositing manager"
DESCRIPTION = "Compiz is an OpenGL compositing manager that uses \
GLX_EXT_texture_from_drawable for binding redirected top-level \
windows to texture objects. It has a flexible plug-in system and it \
is designed to run well on most graphics hardware."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "0.8.18"

RPM_NAME = "compiz-branding-upstream-0.8.18-4.5.aarch64.rpm"
RPM_HASH = "ab27116a2d7b97551c1cdee0a3a3a6b56d2c9df98ceacf617b13e16c24617bdf46eef98bb978b0edb338219af3d8a35f732c3665dc32e5545cb83b505d65343d"

RPROVIDES:${PN} += "compiz-branding \
compiz-branding-upstream"

RDEPENDS:${PN} += "/usr/bin/ln \
/usr/bin/rm \
/usr/bin/sh \
compiz"

inherit rpm
