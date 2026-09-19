SUMMARY = "Haskell language-javascript library development files"
DESCRIPTION = "This package provides the Haskell language-javascript library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.7.1.0"

RPM_NAME = "ghc-language-javascript-devel-0.7.1.0-4.37.aarch64.rpm"
RPM_HASH = "3bff7118a98195a630bf52c99c701854c108ca3d97e9cc0c8e6587da38f51afc7a7e312d5a0731e003a84cc231ae9d52119d7c3a7a92a33044029ed4163a1391"

RPROVIDES:${PN} += "ghc-devel-language-javascript-0.7.1.0-KLLAIgUSnFo2SkJxZVCcjo \
ghc-language-javascript-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-blaze-builder-0.4.4.1-DHhu3j9nndC9LUZIrPJCEG \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-utf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG \
ghc-language-javascript"

inherit rpm
