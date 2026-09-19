SUMMARY = "Haskell lens profiling library"
DESCRIPTION = "This package provides the Haskell lens profiling library."
LICENSE = "BSD-2-Clause"

PV = "5.3.6"

RPM_NAME = "ghc-lens-prof-5.3.6-1.3.aarch64.rpm"
RPM_HASH = "cb2ef037c2e627a8bd4db45ba896f8f37760d2e081fdd4c3d605dd32ac85323c496daba85c89f73c9468552fae8c4b90f82cf5cffc57611c115f9a37de3866b9"

RPROVIDES:${PN} += "ghc-lens-prof \
ghc-prof-lens-5.3.6-J5P8ydEQLUbA8WXxD5pRjA"

RDEPENDS:${PN} += "ghc-lens-devel \
ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-assoc-1.1.1-7ZKlIzFkmc1FQCJcpfYrTi \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-base-orphans-0.9.4-2vMgOxDXOniBrPCxqNGyGO \
ghc-prof-bifunctors-5.6.3-9Dfko6C8LIIe8HG4zoeag \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-call-stack-0.4.0-5oZIckzxOZr1eMyD6xWtI3 \
ghc-prof-comonad-5.0.10-Adp50yscRn74SK6wUdL7QP \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-contravariant-1.5.6-7FVTzec2jegEwzkeRkQOi4 \
ghc-prof-distributive-0.6.3-9lg1Hxwh2KlJVxh3zQCgyL \
ghc-prof-exceptions-0.10.12-f655 \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-free-5.2-4eWU5ydqIMF46nGJ3OnruR \
ghc-prof-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-prof-indexed-traversable-0.1.5-JylwuAInS9n4ImeZ4JChDW \
ghc-prof-indexed-traversable-instances-0.1.2.1-6YpZT8gBjiD9ssAaPGVbKH \
ghc-prof-kan-extensions-5.2.8-BhPXqlF7GPZ4azZSK3TJ3I \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-parallel-3.2.2.0-DHmdQd1fQsJFTMvpGLTdNS \
ghc-prof-profunctors-5.6.3-CPqBm5VgzT9DSAiXWxFcrG \
ghc-prof-reflection-2.1.9-D6RNqRhT9cGDEmA5fjQvJF \
ghc-prof-semigroupoids-6.0.2-B6Y5GIvJ2JI8mXJpMQTJaF \
ghc-prof-strict-0.5.1-9s5NAvHzvkrI18NRIQgFhz \
ghc-prof-tagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7 \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-th-abstraction-0.7.2.0-LVMuWnluhDI5se4FHUInw7 \
ghc-prof-these-1.2.1-IItOvRyyn8cFsXxaqiOQHG \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-prof-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE"

inherit rpm
