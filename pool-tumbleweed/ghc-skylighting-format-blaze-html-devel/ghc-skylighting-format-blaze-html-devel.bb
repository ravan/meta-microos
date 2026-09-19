SUMMARY = "Haskell skylighting-format-blaze-html library development files"
DESCRIPTION = "This package provides the Haskell skylighting-format-blaze-html library \
development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.2"

RPM_NAME = "ghc-skylighting-format-blaze-html-devel-0.1.2-1.3.aarch64.rpm"
RPM_HASH = "4d01b5b4708151cd55fbe6d6245568034df1999d55e338558fd0eb25e68e06e0aefd0e1f5644cff269b32872d28e59b5cab488931273f52c6fd5c4442d542e2f"

RPROVIDES:${PN} += "ghc-devel-skylighting-format-blaze-html-0.1.2-8KLHTNpYrUCBAqffmTPiOR \
ghc-skylighting-format-blaze-html-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-blaze-html-0.9.2.0-93B80xR5emg3yG3V6J7j6o \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-skylighting-core-0.14.7-HkvmMdabOkA2nMBfVgE9uo \
ghc-devel-text-2.1.4-cf23 \
ghc-skylighting-format-blaze-html"

inherit rpm
