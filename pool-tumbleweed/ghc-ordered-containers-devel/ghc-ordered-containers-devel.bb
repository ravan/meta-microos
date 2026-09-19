SUMMARY = "Haskell ordered-containers library development files"
DESCRIPTION = "This package provides the Haskell ordered-containers library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.2.4"

RPM_NAME = "ghc-ordered-containers-devel-0.2.4-1.25.aarch64.rpm"
RPM_HASH = "53addc7816df2205e68d23f89f8b0ff8e8ce23fabce2783a9eed99489f2733ea226b49f8da8f3ad33bc1700a9ee90b2b442aca3cccbdb5ce0159584e805b4ae2"

RPROVIDES:${PN} += "ghc-devel-ordered-containers-0.2.4-AerqY0uBw917ksiEkklhVb \
ghc-ordered-containers-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-ordered-containers"

inherit rpm
