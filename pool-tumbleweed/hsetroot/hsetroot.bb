SUMMARY = "Advanced wallpaper tool for X"
DESCRIPTION = "hsetroot is a tool which allows you to compose wallpapers ('root pixmaps') for \
X. It has a lot of options like rendering gradients, solids, images but it also \
allows you to perform manipulations on those things, or chain them together. \
You could use one standard background image for isntance, and using tint to \
make it fit your current theme. And yes, of course it is compatible with \
semi-translucent applications like aterm and xchat :) \
 \
At this time, hsetroot can render: gradients (multi-color with variable \
distance), solids (rectangles) and images (centered, tiled, fullscreen, or \
maximum aspect). It supports the following manipulations: tinting (overlaying a \
color mask), blurring, sharpening, flipping (horizontally, diagonally, \
vertically) it also allows you to adjust brightness, contrast and gamma-level. \
hsetroot also supports alpha-channels when rendering things."
LICENSE = "GPL-2.0-only"

PV = "1.0.5"

RPM_NAME = "hsetroot-1.0.5-2.20.aarch64.rpm"
RPM_HASH = "49c2ffe889d44e5b4d5fac804d1fe2fc2d837fbf7d1adbe3b41fe038b5a91635248cfec5e6d1ba6e442983fe0396f8fe11bc5ea450cd33aa32c7dca855a9208b"

RPROVIDES:${PN} += "hsetroot"

RDEPENDS:${PN} += "imlib2-filters \
imlib2-loaders \
libImlib2.so.1 \
libX11.so.6 \
libXinerama.so.1 \
libc.so.6"

inherit rpm
