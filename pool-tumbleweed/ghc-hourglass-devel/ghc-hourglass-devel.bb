SUMMARY = "Haskell hourglass library development files"
DESCRIPTION = "This package provides the Haskell hourglass library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.12"

RPM_NAME = "ghc-hourglass-devel-0.2.12-8.23.aarch64.rpm"
RPM_HASH = "f1544fb772263282fc1e4c072ab3971e19313f420fff1b83d6a088e87f156f220a45b2f589d18c419f018929134a6f396c95607868b6a1f152837b0f469c01b9"

RPROVIDES:${PN} += "ghc-devel-hourglass-0.2.12-AVWrQ59TfGxLOqFeNnaO7o \
ghc-hourglass-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-hourglass"

inherit rpm
