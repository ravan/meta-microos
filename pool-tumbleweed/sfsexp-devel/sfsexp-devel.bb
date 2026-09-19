SUMMARY = "Development files for sfsexp"
DESCRIPTION = "This library supports manipulation of symbolic expressions 's-expressions'. \
S-expressions are able to represent complex, structured data without requiring \
additional meta-data describing the structure. \
 \
This package contains the files needed to build packages with sfsexp."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.1"

RPM_NAME = "sfsexp-devel-1.4.1-1.5.aarch64.rpm"
RPM_HASH = "ae339d82938191c0f97d2ee54627090b5015a13a3784ca4e0da54b0888b6fe8a1bc53bbec1b745683a61ec73ec66208726ca170083e394fe8d2e6bb5a2de0572"

RPROVIDES:${PN} += "pkgconfig-sfsexp \
sfsexp-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsexp1"

inherit rpm
