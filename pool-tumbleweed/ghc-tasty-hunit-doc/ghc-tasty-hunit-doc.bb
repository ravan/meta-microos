SUMMARY = "Haskell tasty-hunit library documentation"
DESCRIPTION = "This package provides the Haskell tasty-hunit library documentation."
LICENSE = "MIT"

PV = "0.10.2"

RPM_NAME = "ghc-tasty-hunit-doc-0.10.2-1.18.noarch.rpm"
RPM_HASH = "42ec0bd39ee4a6455bd41de4f478001305aca83943ee45fb949494f0d619d468a0c1b68404ed67da4ca98c40c71f175cf922f901b003e024bc3d96d2ad6d6a16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-tasty-hunit-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
