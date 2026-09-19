SUMMARY = "Documentation for texlive-qsymbols"
DESCRIPTION = "This package includes the documentation for texlive-qsymbols"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-qsymbols-doc-2026.226.svn15878-60.4.noarch.rpm"
RPM_HASH = "35d61bcc0d36b2215dc9e39a6adb307175b795f58bc2bf676370100d6b9a037e9f849759f799879ba42565789db65b13456ee5dcf914cbd48137fbe1c59b4373"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qsymbols-doc"

RDEPENDS:${PN} += ""

inherit rpm
