SUMMARY = "Fish Completion for neocmakelsp"
DESCRIPTION = "Fish command-line completion support for neocmakelsp."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "neocmakelsp-fish-completion-0.9.0-1.5.noarch.rpm"
RPM_HASH = "3a2142d47dff54b1d0d2c7c4275bb6774b698928b65e1abb706e1d8e7407c5387bb3cbe4a8e23dfba04757fca420c09b4e66c7c38434f1dbf3a55f47232f076a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "neocmakelsp-fish-completion"

RDEPENDS:${PN} += "fish \
neocmakelsp"

inherit rpm
