SUMMARY = "An inline image extension for w3m"
DESCRIPTION = "Inline image extension for w3m, the text-based WWW browser. \
 \
When this package is installed w3m can display images inline in an X terminal \
(if it runs in a graphical X Window System environment)."
LICENSE = "ISC"

PV = "0.5.6"

RPM_NAME = "w3m-inline-image-0.5.6-1.4.aarch64.rpm"
RPM_HASH = "d8f47b820aa732079daaa0a4370d8346ef2d719df9d06565a9899a27addb5ccb5d10ebedbd7369ae5c6350a1b9c1c702277f3617ce0c0fe00554c3c6f33aa1d8"

RPROVIDES:${PN} += "w3m-/usr/lib64/w3m/w3mimgdisplay \
w3m-inline-image"

RDEPENDS:${PN} += "imlib2-loaders \
ld-linux-aarch64.so.1 \
libImlib2.so.1 \
libX11.so.6 \
libc.so.6 \
w3m"

inherit rpm
