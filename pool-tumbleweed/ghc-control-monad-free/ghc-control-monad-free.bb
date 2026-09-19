SUMMARY = "Free monads and monad transformers"
DESCRIPTION = "This package provides datatypes to construct Free monads, Free monad \
transformers, and useful instances. In addition it provides the constructs to \
avoid quadratic complexity of left associative bind, as explained in: \
 \
* Janis Voigtlander, /Asymptotic Improvement of Computations over Free Monads, \
MPC'08/."
LICENSE = "SUSE-Public-Domain"

PV = "0.6.2"

RPM_NAME = "ghc-control-monad-free-0.6.2-4.35.aarch64.rpm"
RPM_HASH = "93546055572d3b212cbaba802e0d2e536a3a8a3b38781fc4b3223132bc79f10061225612eb7093b9fa970b82bf9cfd7b5fc8f984b52d5378ead24b9c03daf077"

RPROVIDES:${PN} += "ghc-control-monad-free \
libHScontrol-monad-free-0.6.2-INrHbxo4qSqC5LftAQgJHR-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
