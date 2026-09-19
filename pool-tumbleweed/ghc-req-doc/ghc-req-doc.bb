SUMMARY = "Haskell req library documentation"
DESCRIPTION = "This package provides the Haskell req library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.13.4"

RPM_NAME = "ghc-req-doc-3.13.4-3.5.noarch.rpm"
RPM_HASH = "1d274fbfe19747a9278c3780ac2467e5e427b4231cd4e6b05e87023ae2f47df20ee6c8f7aebf18653447c6d1392ad94603c629bcca2e1f2b4748d03320b555df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-req-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
