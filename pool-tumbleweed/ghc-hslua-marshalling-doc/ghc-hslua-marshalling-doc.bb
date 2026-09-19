SUMMARY = "Haskell hslua-marshalling library documentation"
DESCRIPTION = "This package provides the Haskell hslua-marshalling library documentation."
LICENSE = "MIT"

PV = "2.3.2"

RPM_NAME = "ghc-hslua-marshalling-doc-2.3.2-1.3.noarch.rpm"
RPM_HASH = "edcd571762be9698b9e53122808b6c09423c7b2ef8c44cdcb3696e7c9424edfa39eff62f194bb4ce8b30ec2e312c4b9e5d7caa4e10d85173f4d22c1cdc2728b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-marshalling-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
