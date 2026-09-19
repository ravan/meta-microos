SUMMARY = "GNOME Graphics"
DESCRIPTION = "Handling of digital photos and graphics"
LICENSE = "MIT"

PV = "20250310"

RPM_NAME = "patterns-gnome-gnome_imaging-20250310-10.2.aarch64.rpm"
RPM_HASH = "9697dc026fbc7d89f1808ca8d5531d5e12ecc81ff17eefe63005bf7c4213e1f61812cf0a3c27981ad3a24ad5b8d8ed720428836cbcadf5b58b5ad78898af459b"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-extends- \
pattern-icon- \
pattern-order- \
patterns-gnome-gnome-imaging \
patterns-openSUSE-gnome-imaging"

RDEPENDS:${PN} += "pattern-"

inherit rpm
