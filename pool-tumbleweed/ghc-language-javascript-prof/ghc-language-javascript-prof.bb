SUMMARY = "Haskell language-javascript profiling library"
DESCRIPTION = "This package provides the Haskell language-javascript profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.7.1.0"

RPM_NAME = "ghc-language-javascript-prof-0.7.1.0-4.37.aarch64.rpm"
RPM_HASH = "89bc8fd87c35989c266d0d3b1fc81a9c20c939bd0672e6cd5e543d6c466723d8c51ffa6ff0da12b04bbae82e111cfe6f540f48144420734b5295055e5f734b86"

RPROVIDES:${PN} += "ghc-language-javascript-prof \
ghc-prof-language-javascript-0.7.1.0-KLLAIgUSnFo2SkJxZVCcjo"

RDEPENDS:${PN} += "ghc-language-javascript-devel \
ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-blaze-builder-0.4.4.1-DHhu3j9nndC9LUZIrPJCEG \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-utf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG"

inherit rpm
