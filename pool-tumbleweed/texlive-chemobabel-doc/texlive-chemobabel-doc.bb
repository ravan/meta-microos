SUMMARY = "Documentation for texlive-chemobabel"
DESCRIPTION = "This package includes the documentation for texlive-chemobabel"
LICENSE = "BSD-3-Clause"

PV = "2026.226.0.0.9lsvn64778"

RPM_NAME = "texlive-chemobabel-doc-2026.226.0.0.9lsvn64778-60.2.noarch.rpm"
RPM_HASH = "ca53b26e5f4c3a1acf2adb74f34c32d85ea7c7532a5228e70581d4160b26843af4ea3c31696ca8579b2b2ab962f9586b6b97966c5ec9ffd760be9f0a04dbf3bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-chemobabel-doc-en;ja \
texlive-chemobabel-doc"

RDEPENDS:${PN} += ""

inherit rpm
