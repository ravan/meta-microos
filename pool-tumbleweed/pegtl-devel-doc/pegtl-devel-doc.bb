SUMMARY = "Parsing Expression Grammar (PEG) Template Library"
DESCRIPTION = "This package contains the development documentation for \
PEGTL (Parsing Expression Grammar Template Library)."
LICENSE = "MIT"

PV = "3.2.8"

RPM_NAME = "pegtl-devel-doc-3.2.8-1.4.noarch.rpm"
RPM_HASH = "e431d6cf37be40c519ad43e3c27c8eb8d3ed3bc9d3f043c05e6b0dd53cc737ed3ae261d33e6cfebe7c06ff7f9da82ff53a45f5ac2fc9f066991eb85e4ec9ffd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pegtl-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
