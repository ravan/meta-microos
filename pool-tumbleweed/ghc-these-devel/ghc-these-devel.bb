SUMMARY = "Haskell these library development files"
DESCRIPTION = "This package provides the Haskell these library development files."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "ghc-these-devel-1.2.1-4.2.aarch64.rpm"
RPM_HASH = "ec58fe66e0ab5d5e69b6db66dbb30bd8c3d90ee69ed30ed2eee62468cb1c559db78433b10742208bd4963ceeaeec51e1a1012aabde9e344101f0d666f54dc191"

RPROVIDES:${PN} += "ghc-devel-these-1.2.1-IItOvRyyn8cFsXxaqiOQHG \
ghc-these-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-assoc-1.1.1-7ZKlIzFkmc1FQCJcpfYrTi \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-binary-0.8.9.3-9861 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-these"

inherit rpm
