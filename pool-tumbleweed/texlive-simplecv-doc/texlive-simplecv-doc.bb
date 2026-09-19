SUMMARY = "Documentation for texlive-simplecv"
DESCRIPTION = "This package includes the documentation for texlive-simplecv"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6asvn35537"

RPM_NAME = "texlive-simplecv-doc-2026.226.1.6asvn35537-60.2.noarch.rpm"
RPM_HASH = "507fb9573cff7c39331ea4cad6c395121593eb4ec535a682ababff60ad9290fb649aa54525e8cada4c9c84400c64162a08166524f55798a30ffde2a69129d55b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-simplecv-doc"

RDEPENDS:${PN} += ""

inherit rpm
