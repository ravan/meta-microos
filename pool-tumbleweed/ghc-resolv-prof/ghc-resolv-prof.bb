SUMMARY = "Haskell resolv profiling library"
DESCRIPTION = "This package provides the Haskell resolv profiling library."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.0.3"

RPM_NAME = "ghc-resolv-prof-0.2.0.3-1.9.aarch64.rpm"
RPM_HASH = "f81d8dfc579cb94b9c54766901bee95fffbd310fc4a4248ba23f1add13185ed0dee0fc7b4e01000c321f5ae1f63fb6ddf249b7a53d51c0967d03a77cad51a37e"

RPROVIDES:${PN} += "ghc-prof-resolv-0.2.0.3-2a3UXbRQZR0IVSb1MrCNb4 \
ghc-resolv-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-base16-bytestring-1.0.2.0-IiVu4f3aSfMH2rpDgRP1QL \
ghc-prof-binary-0.8.9.3-9861 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-resolv-devel"

inherit rpm
