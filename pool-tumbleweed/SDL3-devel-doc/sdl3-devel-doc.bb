SUMMARY = "Manual pages for the SDL3 API"
DESCRIPTION = "This package contains manual pages (in troff format) for the \
SDL3 C API."
LICENSE = "Zlib"

PV = "3.4.16"

RPM_NAME = "SDL3-devel-doc-3.4.16-1.1.noarch.rpm"
RPM_HASH = "255c1224536f41693eb917d1321070993eaf5ce68cf2a94813316a5c43048767e5ec13707e5a64268727ed8210c3c8562e43f096f6bb497508d66c7a67ad2ef5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "SDL3-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
