SUMMARY = "Haskell cmdargs library documentation"
DESCRIPTION = "This package provides the Haskell cmdargs library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.10.22"

RPM_NAME = "ghc-cmdargs-doc-0.10.22-1.35.noarch.rpm"
RPM_HASH = "4ef3d247957c65b0fd1c87e63efe3d9d272c40330d3052b53c06edde9dca64dba1393163cd4588df1127920f6bfaf4364bdc9e4220aeeb386d05f47ef9b8f14a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cmdargs-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
