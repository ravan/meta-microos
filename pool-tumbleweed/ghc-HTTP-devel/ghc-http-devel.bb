SUMMARY = "Haskell HTTP library development files"
DESCRIPTION = "This package provides the Haskell HTTP library development files."
LICENSE = "BSD-3-Clause"

PV = "4000.4.1"

RPM_NAME = "ghc-HTTP-devel-4000.4.1-5.11.aarch64.rpm"
RPM_HASH = "3ff68281eefaf6a22f75e31c214849e5584eaade2f35b3b0aa0aac45e90394cb84402b6dad8e02536567f1797dfc6281797eca60a1e3d590cfa6a877f0ce0bbe"

RPROVIDES:${PN} += "ghc-HTTP-devel \
ghc-devel-HTTP-4000.4.1-G8VuDcYxUIH9Vk3NDIhhHx"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-HTTP \
ghc-compiler \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-devel-network-uri-2.6.4.2-BA29PoG9pX1EAcGKolsVh8 \
ghc-devel-parsec-3.1.18.0-be05 \
ghc-devel-time-1.14-a7dc \
ghc-devel-transformers-0.6.3.0-4709"

inherit rpm
