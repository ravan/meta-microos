SUMMARY = "EFL image viewer/editor/manipulator/slideshow creator"
DESCRIPTION = "Ephoto is an image viewer and editor. \
 \
Images can be viewed one at a time, in thumbnail groups, or as a slideshow. \
In terms of editing, images can be rotated/mirrored, cropped, colors be \
adjusted and artistic filters be applied."
LICENSE = "BSD-3-Clause"

PV = "1.5"

RPM_NAME = "ephoto-1.5-1.40.aarch64.rpm"
RPM_HASH = "1b41791bdecaf15f5e16c97827808584ff4ccfd97fbdfa9b6c20abab1331e907dd142494ed2cae8087dcc6b0359b984b5bf5b919c0290191607c26a2cce414fa"

RPROVIDES:${PN} += "ephoto"

RDEPENDS:${PN} += "efl \
elementary \
evas-generic-loaders \
ld-linux-aarch64.so.1 \
libc.so.6 \
libecore-con.so.1 \
libecore-evas.so.1 \
libecore-file.so.1 \
libecore-ipc.so.1 \
libecore.so.1 \
libedje.so.1 \
libeet.so.1 \
libefreet.so.1 \
libeina.so.1 \
libeio.so.1 \
libelementary.so.1 \
libevas.so.1 \
libm.so.6"

inherit rpm
