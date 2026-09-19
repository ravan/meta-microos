SUMMARY = "Haskell dbus library development files"
DESCRIPTION = "This package provides the Haskell dbus library development files."
LICENSE = "Apache-2.0"

PV = "1.4.3"

RPM_NAME = "ghc-dbus-devel-1.4.3-1.3.aarch64.rpm"
RPM_HASH = "d3db51a7dfe8303a0ff5271637a86be3a0b80ac50afb2b31303a5eed9dfb15da98d7f5bfbc2143b42b590073f503b01059edbbab13fe3f3bb77bebe5772ec29d"

RPROVIDES:${PN} += "ghc-dbus-devel \
ghc-devel-dbus-1.4.3-AK2RsEkhlPQ2FoxHH6Vf1Q"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-dbus \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-cereal-0.5.8.3-9RjPyVhfWFC69r1oCUPmww \
ghc-devel-conduit-1.3.6.1-DuJaiNNDon54jV6QjcNayt \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-exceptions-0.10.12-f655 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-lens-5.3.6-J5P8ydEQLUbA8WXxD5pRjA \
ghc-devel-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-devel-parsec-3.1.18.0-be05 \
ghc-devel-random-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh \
ghc-devel-split-0.2.5-DF0qBqNymX3Hv5Ta0307xc \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-th-lift-0.8.7-C08bSURuEXt2IuYgZMzZEc \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-unix-2.8.8.0-178a \
ghc-devel-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-devel-xml-conduit-1.10.1.0-Jdtas0kp0k3Ah1vCZSqZl4 \
ghc-devel-xml-types-0.3.8-35OA2z37X8M4UCRyGooeYw"

inherit rpm
