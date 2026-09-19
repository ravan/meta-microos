SUMMARY = "Documentation of Ogg/Vorbis library"
DESCRIPTION = "This package contains documents for Ogg/Vorbis library, including the \
API reference."
LICENSE = "BSD-3-Clause"

PV = "1.3.7"

RPM_NAME = "libvorbis-doc-1.3.7-5.8.noarch.rpm"
RPM_HASH = "32f312b49b640622bef652c004f5d3622a6f7fbbf341b6fac3744a614c89d356125667ddbed2e23cc99e399d3cccdc26160d03b095776abb9e9f834c0ed93ad4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libvorbis-doc"

RDEPENDS:${PN} += ""

inherit rpm
