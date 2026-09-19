SUMMARY = "Fish completion for tilth"
DESCRIPTION = "Fish command line completion for tilth, generated during the build."
LICENSE = "Apache-2.0 & BSD-3-Clause & MIT & Zlib"

PV = "0.10.1"

RPM_NAME = "tilth-fish-completion-0.10.1-1.1.noarch.rpm"
RPM_HASH = "9e5f917bfa1eb4a4ee67c46894e2e31077868ff36d1d755f44be8546b73e5716b04a419f4f01d0c14cbd91a215c50b43f24a055a06a9e1db98a094b390eb4047"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tilth-fish-completion"

RDEPENDS:${PN} += "tilth"

inherit rpm
