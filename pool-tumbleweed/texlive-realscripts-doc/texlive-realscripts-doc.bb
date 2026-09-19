SUMMARY = "Documentation for texlive-realscripts"
DESCRIPTION = "This package includes the documentation for texlive-realscripts"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3dsvn77682"

RPM_NAME = "texlive-realscripts-doc-2026.226.0.0.3dsvn77682-60.4.noarch.rpm"
RPM_HASH = "e79d2632bc7efd75600140e20973236986e190d624161bc4a02d70326cc2758270e2cbc309d12f7c1a0dfe6e1fb9e6147d4aa078bffa6064563633a57db574d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-realscripts-doc"

RDEPENDS:${PN} += ""

inherit rpm
