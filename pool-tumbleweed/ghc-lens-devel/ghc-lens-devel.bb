SUMMARY = "Haskell lens library development files"
DESCRIPTION = "This package provides the Haskell lens library development files."
LICENSE = "BSD-2-Clause"

PV = "5.3.6"

RPM_NAME = "ghc-lens-devel-5.3.6-1.3.aarch64.rpm"
RPM_HASH = "04c0143cfb54592e5b34071824a555476cc0b9484203ef7bb27abf365d2fd3fe9a8122fcde27291f5dec318c6edbc89dc9f94e0b55fb701652368c5cb9c8a648"

RPROVIDES:${PN} += "ghc-devel-lens-5.3.6-J5P8ydEQLUbA8WXxD5pRjA \
ghc-lens-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-assoc-1.1.1-7ZKlIzFkmc1FQCJcpfYrTi \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-base-orphans-0.9.4-2vMgOxDXOniBrPCxqNGyGO \
ghc-devel-bifunctors-5.6.3-9Dfko6C8LIIe8HG4zoeag \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-call-stack-0.4.0-5oZIckzxOZr1eMyD6xWtI3 \
ghc-devel-comonad-5.0.10-Adp50yscRn74SK6wUdL7QP \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-contravariant-1.5.6-7FVTzec2jegEwzkeRkQOi4 \
ghc-devel-distributive-0.6.3-9lg1Hxwh2KlJVxh3zQCgyL \
ghc-devel-exceptions-0.10.12-f655 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-free-5.2-4eWU5ydqIMF46nGJ3OnruR \
ghc-devel-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-devel-indexed-traversable-0.1.5-JylwuAInS9n4ImeZ4JChDW \
ghc-devel-indexed-traversable-instances-0.1.2.1-6YpZT8gBjiD9ssAaPGVbKH \
ghc-devel-kan-extensions-5.2.8-BhPXqlF7GPZ4azZSK3TJ3I \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-parallel-3.2.2.0-DHmdQd1fQsJFTMvpGLTdNS \
ghc-devel-profunctors-5.6.3-CPqBm5VgzT9DSAiXWxFcrG \
ghc-devel-reflection-2.1.9-D6RNqRhT9cGDEmA5fjQvJF \
ghc-devel-semigroupoids-6.0.2-B6Y5GIvJ2JI8mXJpMQTJaF \
ghc-devel-strict-0.5.1-9s5NAvHzvkrI18NRIQgFhz \
ghc-devel-tagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7 \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-th-abstraction-0.7.2.0-LVMuWnluhDI5se4FHUInw7 \
ghc-devel-these-1.2.1-IItOvRyyn8cFsXxaqiOQHG \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-devel-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-lens"

inherit rpm
