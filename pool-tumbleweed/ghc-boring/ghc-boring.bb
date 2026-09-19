SUMMARY = "Boring and Absurd types"
DESCRIPTION = "* 'Boring' types are isomorphic to '()'. \
 \
* 'Absurd' types are isomorphic to 'Void'. \
 \
See [What does () mean in Haskell -answer by Conor \
McBride](https://stackoverflow.com/questions/33112439/what-does-mean-in-haskell/33115522#33115522)."
LICENSE = "BSD-3-Clause"

PV = "0.2.2.1"

RPM_NAME = "ghc-boring-0.2.2.1-1.3.aarch64.rpm"
RPM_HASH = "ca9b96d12ded2fdc5d3030f10b3c77e81e22c88ced0e7ee9e389b64e821e6f5ae3c40e83021c59e0eeed0815e91274ea59c93ca61c8aeca6e96be4e5cc6a540f"

RPROVIDES:${PN} += "ghc-boring \
libHSboring-0.2.2.1-8s8A4hTb7xgDndEEz6qoTw-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHStagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
