SUMMARY = "Haskell ShellCheck library documentation"
DESCRIPTION = "This package provides the Haskell ShellCheck library documentation."
LICENSE = "GPL-3.0-or-later"

PV = "0.11.0"

RPM_NAME = "ghc-ShellCheck-doc-0.11.0-1.3.noarch.rpm"
RPM_HASH = "94e0bb4c146cce11c50d8756410ddc85e2d73d1429cbf39f4a71674cf1813c80a1941a7813fbec780a55b7338154b1a5583a23b25330408969307af421ab6d38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ShellCheck-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
