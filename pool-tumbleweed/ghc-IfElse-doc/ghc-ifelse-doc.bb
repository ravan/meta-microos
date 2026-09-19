SUMMARY = "Haskell IfElse library documentation"
DESCRIPTION = "This package provides the Haskell IfElse library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.85"

RPM_NAME = "ghc-IfElse-doc-0.85-4.19.noarch.rpm"
RPM_HASH = "4c7f8844babe9066dcbb086c9bafaff728de0190bc116618d823a6b9b21a64a637f5b5d74e6feb8ba8a9d82cbebe17b5fb16449c606ab16f9c09fdd0a3b6c07a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-IfElse-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
