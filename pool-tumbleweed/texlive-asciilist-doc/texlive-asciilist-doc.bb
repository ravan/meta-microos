SUMMARY = "Documentation for texlive-asciilist"
DESCRIPTION = "This package includes the documentation for texlive-asciilist"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2bsvn77682"

RPM_NAME = "texlive-asciilist-doc-2026.226.2.2bsvn77682-60.2.noarch.rpm"
RPM_HASH = "a8cb037065dbddd11be997f49bf16c83fd2276bf65ac7abfe73efc89b5dfcfc6e8f3a6c9b7653e7d23801548e49592ea52d4203e791ca7e34d8d9991a1f87266"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-asciilist-doc"

RDEPENDS:${PN} += ""

inherit rpm
