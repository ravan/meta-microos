SUMMARY = "GAP: Tools for generating automatic GAPDoc documentations"
DESCRIPTION = "This package is supposed to help creating documentations for GAP \
packages. It makes it possible to create documentation without \
writing .xml. It is not in any way a substitution for GAPDoc, but \
needs it to compile its output."
LICENSE = "GPL-2.0-only"

PV = "2026.06.30"

RPM_NAME = "gap-autodoc-2026.06.30-1.1.noarch.rpm"
RPM_HASH = "ff43b27a500dbd582b381dddffd30228232b4294ea88ceb69abc4b6650f04258b52424cf8cd62b57d3529f6c6e3873025ed6c6b313fec434adb936509609c274"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-autodoc"

RDEPENDS:${PN} += "gap-core \
gap-gapdoc"

inherit rpm
