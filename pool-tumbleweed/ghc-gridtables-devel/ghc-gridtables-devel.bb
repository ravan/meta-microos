SUMMARY = "Haskell gridtables library development files"
DESCRIPTION = "This package provides the Haskell gridtables library development files."
LICENSE = "MIT"

PV = "0.1.1.0"

RPM_NAME = "ghc-gridtables-devel-0.1.1.0-1.5.aarch64.rpm"
RPM_HASH = "b61fd10eaf252a2cbb3f282c54062b82e477dce2299f170e5972e3647ff3abc55fc714fa1b005df8e1ce280c12fa6d222baaaede250d0003560f58262ebffaa7"

RPROVIDES:${PN} += "ghc-devel-gridtables-0.1.1.0-KsHUhKw0ygq7hJHkhQZNzX \
ghc-gridtables-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-doclayout-0.5.0.3-6oU5Og9jiD67xwlm4qJ1ii \
ghc-devel-parsec-3.1.18.0-be05 \
ghc-devel-text-2.1.4-cf23 \
ghc-gridtables"

inherit rpm
