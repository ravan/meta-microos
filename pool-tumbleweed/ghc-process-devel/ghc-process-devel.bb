SUMMARY = "Haskell process library development files"
DESCRIPTION = "This package provides the Haskell process library development files."
LICENSE = "BSD-3-Clause"

PV = "1.6.26.1"

RPM_NAME = "ghc-process-devel-1.6.26.1-1.3.aarch64.rpm"
RPM_HASH = "5a3233b7c6625eda71357420fbf32d810f1619bb787888b9eae70da622eea3472d60522e6388ef2c89820dfb2cf736046a16152e39948df7e609828f3fa7c96a"

RPROVIDES:${PN} += "ghc-devel-process-1.6.26.1-905d \
ghc-process-devel \
ghc-process-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-os-string-2.0.10-5320 \
ghc-devel-unix-2.8.8.0-178a \
ghc-process"

inherit rpm
