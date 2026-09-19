SUMMARY = "Documentation for texlive-metauml"
DESCRIPTION = "This package includes the documentation for texlive-metauml"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.2.6svn49923"

RPM_NAME = "texlive-metauml-doc-2026.226.0.0.2.6svn49923-61.2.noarch.rpm"
RPM_HASH = "a8745038114a41acb0f0ef2b163f5081234b195be1d130b6c2c50c533df480e1dc1c22f3ed35159bd15e10c3a1ab927a191c8336c367115b3fe5fc5982c4b4e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metauml-doc"

RDEPENDS:${PN} += ""

inherit rpm
