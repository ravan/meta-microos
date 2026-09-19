SUMMARY = "Development files for the X11 Composite extension library"
DESCRIPTION = "The composite extension provides several related mechanisms: \
- Per-hierarchy storage: The rendering of an entire hierarchy of \
  windows is redirected to off-screen storage. \
- Automatic shadow update: When a hierarchy is rendered off-screen, \
  the X server provides an automatic mechanism for presenting those \
  contents within the parent window. \
- Composite overlay window: provides compositing managers with a \
  surface on which to draw without interference. \
- Parent window clipping: modifies the semantics of parent window \
  clipping in the presence of manual redirected children. \
 \
This package contains the development headers for the library found \
in libXcomposite1."
LICENSE = "MIT"

PV = "0.4.7"

RPM_NAME = "libXcomposite-devel-0.4.7-1.4.aarch64.rpm"
RPM_HASH = "9004ef08f0fd8877a4e5a578513e438059107936b85528e59a70711e428ebe753eb315c7a392b1feae48317184590327dd7f436892cf163ff9065854a5eda66d"

RPROVIDES:${PN} += "libXcomposite-devel \
pkgconfig-xcomposite"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXcomposite1 \
pkgconfig-compositeproto \
pkgconfig-x11 \
pkgconfig-xfixes \
pkgconfig-xproto"

inherit rpm
