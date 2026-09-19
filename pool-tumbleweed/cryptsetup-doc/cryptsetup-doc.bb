SUMMARY = "Cryptsetup Documentation"
DESCRIPTION = "Documentation and man pages for cryptsetup"
LICENSE = "CC-BY-SA-4.0 & LGPL-2.0-or-later-with-cryptsetup-OpenSSL-exception"

PV = "2.8.7"

RPM_NAME = "cryptsetup-doc-2.8.7-1.2.noarch.rpm"
RPM_HASH = "d3308afa6bd2ce250b358c3d95acb41923807b42acc736447834a78f32ddd8ead72bffedafa65dc229142a45aa91c84e1a298494cb8252d2e5185a8563420791"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cryptsetup-doc"

RDEPENDS:${PN} += ""

inherit rpm
