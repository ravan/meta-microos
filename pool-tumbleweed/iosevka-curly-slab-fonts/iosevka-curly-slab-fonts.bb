SUMMARY = "Iosevka in monospace slab-serif curly style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka Curly Slab typeface (curly style, \
slab-serif)."
LICENSE = "OFL-1.1"

PV = "34.8.1"

RPM_NAME = "iosevka-curly-slab-fonts-34.8.1-1.1.noarch.rpm"
RPM_HASH = "dacfda6ff803c49124a237878e8acc8057575f16f83a3b0db2937a897817037700124977ef30b25cb1e09ffab916e305cd76314a65340e57c72212000bdf5154"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-curly-slab-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
