SUMMARY = "Allegro Documentation"
DESCRIPTION = "Allegro HTML documentation and man pages."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.11.3"

RPM_NAME = "liballegro-doc-5.2.11.3-1.5.noarch.rpm"
RPM_HASH = "605488b316944fdd0603551d2e8f7c8460ec05fad35c348b85c0771c973e5266cd75ab3b4ef18e41c16a4ac8b8a794c2b19eac0dfe16eb811544e7a5e7a33819"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "liballegro-doc"

RDEPENDS:${PN} += ""

inherit rpm
