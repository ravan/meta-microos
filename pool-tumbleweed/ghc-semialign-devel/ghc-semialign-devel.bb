SUMMARY = "Haskell semialign library development files"
DESCRIPTION = "This package provides the Haskell semialign library development files."
LICENSE = "BSD-3-Clause"

PV = "1.3.1.1"

RPM_NAME = "ghc-semialign-devel-1.3.1.1-1.3.aarch64.rpm"
RPM_HASH = "3842eea5cb0047b9b98ecd92e942b1216258b8ed92ae3eac5acdaf1241ee58a77bd6e641b41154b71264880eba373c1ea613adbd76223e0da4e7cedd7cb7588f"

RPROVIDES:${PN} += "ghc-devel-semialign-1.3.1.1-2gupAkHqo8uDH6Y43n5yi0 \
ghc-semialign-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-devel-indexed-traversable-0.1.5-JylwuAInS9n4ImeZ4JChDW \
ghc-devel-indexed-traversable-instances-0.1.2.1-6YpZT8gBjiD9ssAaPGVbKH \
ghc-devel-semigroupoids-6.0.2-B6Y5GIvJ2JI8mXJpMQTJaF \
ghc-devel-tagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7 \
ghc-devel-these-1.2.1-IItOvRyyn8cFsXxaqiOQHG \
ghc-devel-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-devel-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-semialign"

inherit rpm
