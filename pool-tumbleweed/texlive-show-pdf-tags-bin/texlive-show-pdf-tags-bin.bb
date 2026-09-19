SUMMARY = "Binary files of show-pdf-tags"
DESCRIPTION = "Binary files of show-pdf-tags"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn75482"

RPM_NAME = "texlive-show-pdf-tags-bin-2026.20260301.svn75482-120.4.aarch64.rpm"
RPM_HASH = "3ebcf5ce578e2a9568a5af16cb2a55e6d524ae511d9b8b9dd3a2486900b21d775460fab321e20e9e1bc23767c61c8f21d8c27dec78de42a6e6c26a4130ea6849"

RPROVIDES:${PN} += "texlive-show-pdf-tags-bin"

RDEPENDS:${PN} += "texlive-show-pdf-tags"

inherit rpm
