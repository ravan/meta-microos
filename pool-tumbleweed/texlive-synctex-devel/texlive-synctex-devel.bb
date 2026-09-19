SUMMARY = "Libraries of The Synchronization TeXnology"
DESCRIPTION = "This package includes the synctex development files. \
The Synchronization TeXnology by Jérôme Laurens is a new feature \
of recent TeX engines.  It allows to synchronize between input \
and output, which means to navigate from the source document to \
the typeset material and vice versa."
LICENSE = "MIT"

PV = "1.21"

RPM_NAME = "texlive-synctex-devel-1.21-120.4.aarch64.rpm"
RPM_HASH = "8163c44b2009a7f82e30272e4b4db8bd235c13f7ecbb62ba28b96e1d2f9542dc3a1f57950304ae2bc2bc42c206924b4e448afdcd3ceffdc7478a63a473c0b94a"

RPROVIDES:${PN} += "pkgconfig-synctex \
texlive-synctex-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsynctex2 \
pkgconfig-zlib"

inherit rpm
