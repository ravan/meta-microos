SUMMARY = "Powerful fractal generator"
DESCRIPTION = "XaoS is a fast portable real-time interactive fractal zoomer. It \
displays the Mandelbrot set (among other escape time fractals) and \
allows you to zoom smoothly into the fractal.  Various coloring modes \
are provided for both the points inside and outside the selected set. \
In addition, switching between Julia and Mandelbrot fractal types and \
displaying planes is provided."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.4"

RPM_NAME = "xaos-4.3.4-1.6.aarch64.rpm"
RPM_HASH = "db7eac775bf90905934982de34208dd21903ac440cb29045e16535e0c08cb3b03d741dc9370a3cc50f93b9a84a5b12380d5c8308bfcda241a9b7e8a12d4009a2"

RPROVIDES:${PN} += "XaoS \
xaos"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
