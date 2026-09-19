SUMMARY = "Library Development Files for Tracing a Bitmap to Scalable Outline Image"
DESCRIPTION = "Potrace is a utility for tracing a bitmap, which means, transforming a \
bitmap into a smooth, scalable image.  The input is a bitmap (PBM, PGM, \
PPM, or BMP), and the default output is one of several vector file \
formats.  A typical use is to create EPS files from scanned data, such \
as company or university logos, handwritten notes, etc. The resulting \
image is not 'jaggy' like a bitmap, but smooth. It can then be rendered \
at any resolution."
LICENSE = "GPL-2.0-or-later"

PV = "1.16"

RPM_NAME = "potrace-devel-1.16-2.10.aarch64.rpm"
RPM_HASH = "52a43a11327e868d9f085a8667af50494402f009c4c10db6eeb70539d6ebaf0cfc6a6035cbe07c0eaf6436af75d61b6971ba9239f7ce5f0911a653941a85b13e"

RPROVIDES:${PN} += "potrace-devel"

RDEPENDS:${PN} += "potrace"

inherit rpm
