SUMMARY = "Documentation for texlive-tocloft"
DESCRIPTION = "This package includes the documentation for texlive-tocloft"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.3jsvn77682"

RPM_NAME = "texlive-tocloft-doc-2026.226.2.3jsvn77682-59.2.noarch.rpm"
RPM_HASH = "93ea402a5f4a537535e27e62f162d0f4121821c8a428a65adb0c11768e68b758671728c5971f21059f9df7121a603327716f271c54ece161e3cbad29a3579b0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tocloft-doc"

RDEPENDS:${PN} += ""

inherit rpm
