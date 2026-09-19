SUMMARY = "Documentation for texlive-shadow"
DESCRIPTION = "This package includes the documentation for texlive-shadow"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-shadow-doc-2026.226.svn77682-60.2.noarch.rpm"
RPM_HASH = "cc190f31324c83878c217b2020d1972c7d387c3013108ecfbb2812e7160e498230bb4e1c5bd433317f9181b7831436a712e20c44f32a978469da2e1f5fe47530"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-shadow-doc"

RDEPENDS:${PN} += ""

inherit rpm
