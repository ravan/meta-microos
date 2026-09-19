SUMMARY = "Haskell semialign profiling library"
DESCRIPTION = "This package provides the Haskell semialign profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.3.1.1"

RPM_NAME = "ghc-semialign-prof-1.3.1.1-1.3.aarch64.rpm"
RPM_HASH = "e69ab5572ee8d4b34b082e3deb5c41d87340f81958de1069ed30d0b76fc34a74fa89333ca8ea96381a4d45ca9dc4096624612861021eab09df38f06fabb709c9"

RPROVIDES:${PN} += "ghc-prof-semialign-1.3.1.1-2gupAkHqo8uDH6Y43n5yi0 \
ghc-semialign-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-prof-indexed-traversable-0.1.5-JylwuAInS9n4ImeZ4JChDW \
ghc-prof-indexed-traversable-instances-0.1.2.1-6YpZT8gBjiD9ssAaPGVbKH \
ghc-prof-semigroupoids-6.0.2-B6Y5GIvJ2JI8mXJpMQTJaF \
ghc-prof-tagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7 \
ghc-prof-these-1.2.1-IItOvRyyn8cFsXxaqiOQHG \
ghc-prof-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-prof-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-semialign-devel"

inherit rpm
