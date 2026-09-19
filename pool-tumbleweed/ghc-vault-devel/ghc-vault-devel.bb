SUMMARY = "Haskell vault library development files"
DESCRIPTION = "This package provides the Haskell vault library development files."
LICENSE = "BSD-3-Clause"

PV = "0.3.2.0"

RPM_NAME = "ghc-vault-devel-0.3.2.0-1.2.aarch64.rpm"
RPM_HASH = "50222c59a5bccf0328f80ae3f0c153aa91196a868e07c6bb7d5a03cf893a86e22b44572b545bc43626d388263b5f11fff56b3366f419e3f60bfe1386b2aa397a"

RPROVIDES:${PN} += "ghc-devel-vault-0.3.2.0-GYOqPpJA2DW5Qz2IFtkvei \
ghc-vault-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-devel-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-vault"

inherit rpm
