SUMMARY = "Haskell dbus profiling library"
DESCRIPTION = "This package provides the Haskell dbus profiling library."
LICENSE = "Apache-2.0"

PV = "1.4.3"

RPM_NAME = "ghc-dbus-prof-1.4.3-1.3.aarch64.rpm"
RPM_HASH = "837466589da3cbc822d60f9c7cce54f6ca0b8d6fdcc2148e1979f520672423645b7825023aba8b096ea6a4916b8732bae02b35e1989a091c592ff4408a21d215"

RPROVIDES:${PN} += "ghc-dbus-prof \
ghc-prof-dbus-1.4.3-AK2RsEkhlPQ2FoxHH6Vf1Q"

RDEPENDS:${PN} += "ghc-dbus-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-cereal-0.5.8.3-9RjPyVhfWFC69r1oCUPmww \
ghc-prof-conduit-1.3.6.1-DuJaiNNDon54jV6QjcNayt \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-exceptions-0.10.12-f655 \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-lens-5.3.6-J5P8ydEQLUbA8WXxD5pRjA \
ghc-prof-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-prof-parsec-3.1.18.0-be05 \
ghc-prof-random-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh \
ghc-prof-split-0.2.5-DF0qBqNymX3Hv5Ta0307xc \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-th-lift-0.8.7-C08bSURuEXt2IuYgZMzZEc \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-unix-2.8.8.0-178a \
ghc-prof-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-prof-xml-conduit-1.10.1.0-Jdtas0kp0k3Ah1vCZSqZl4 \
ghc-prof-xml-types-0.3.8-35OA2z37X8M4UCRyGooeYw"

inherit rpm
