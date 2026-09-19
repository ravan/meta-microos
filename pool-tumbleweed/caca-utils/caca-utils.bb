SUMMARY = "Colour ASCII Art Text mode graphics utilities based on libcaca"
DESCRIPTION = "This package contains utilities and demonstration programs for libcaca, \
the Colour AsCii Art library. \
 \
cacaview is a simple image viewer for the terminal. It opens most image \
formats such as JPEG, PNG, GIF etc. and renders them on the terminal \
using ASCII art. The user can zoom and scroll the image, set the \
dithering method or enable anti-aliasing. \
 \
cacaball is a tiny graphic program that renders animated ASCII \
metaballs on the screen, cacafire is a port of AALib's aafire and \
displays burning ASCII art flames, and cacademo is a simple application \
that shows the libcaca rendering features such as line and ellipses \
drawing, triangle filling and sprite blitting."
LICENSE = "WTFPL"

PV = "0.99.beta20+git.1776622070.7c8e333"

RPM_NAME = "caca-utils-0.99.beta20+git.1776622070.7c8e333-2.3.aarch64.rpm"
RPM_HASH = "3fc521b3b7dde033512bb85b949656ccaaed98b372417f88b520021b96b25ba2e39cbe324ae7a50ca7738c696d88e8ba557b341b1e3553b3dbc5038739efb35c"

RPROVIDES:${PN} += "caca-utils"

RDEPENDS:${PN} += "imlib2-loaders \
ld-linux-aarch64.so.1 \
libImlib2.so.1 \
libc.so.6 \
libcaca.so.0 \
libm.so.6 \
toilet"

inherit rpm
