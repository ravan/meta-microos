SUMMARY = "Iosevka in monospace slab-serif style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka Slab typeface (monospace, slab-serif)."
LICENSE = "OFL-1.1"

PV = "34.8.1"

RPM_NAME = "iosevka-slab-fonts-34.8.1-1.1.noarch.rpm"
RPM_HASH = "36fdd6bee734d142230cfef531d637de18436bab7772cbe24e32526ba0a233f62094017cc0149c13a4d5cd10ce1c128e4d8477d591da051d12c3ff4628fc15f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-slab-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
