SUMMARY = "Binary files of clojure-pamphlet"
DESCRIPTION = "Binary files of clojure-pamphlet"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn51944"

RPM_NAME = "texlive-clojure-pamphlet-bin-2026.20260301.svn51944-120.4.aarch64.rpm"
RPM_HASH = "8eb71c25ef292c0e5990234b6c1df86055f3ca5400964854a6c3d45d9228a2b64c8ce9bea645819400b5a580064a194f3607e79938bde567126a50def4dd414f"

RPROVIDES:${PN} += "texlive-clojure-pamphlet-bin"

RDEPENDS:${PN} += "texlive-clojure-pamphlet"

inherit rpm
