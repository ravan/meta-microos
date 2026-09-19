SUMMARY = "Haskell wai-extra library documentation"
DESCRIPTION = "This package provides the Haskell wai-extra library documentation."
LICENSE = "MIT"

PV = "3.1.18"

RPM_NAME = "ghc-wai-extra-doc-3.1.18-1.17.noarch.rpm"
RPM_HASH = "fa11da3dac38e7306d88e530a316be9c6036c820f8b9bc42851034c45f4a3e3af30fc9fbe6c3c7cae6109b0ec6573b95f18ce3a9beac08876389acd3152fecfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-wai-extra-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
