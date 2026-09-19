SUMMARY = "Backported Control.Monad.Except module from mtl"
DESCRIPTION = "This package backports the 'Control.Monad.Except' module from 'mtl' (if using \
'mtl-2.2.0.1' or earlier), which reexports the 'ExceptT' monad transformer and \
the 'MonadError' class. \
 \
This package should only be used if there is a need to use the \
'Control.Monad.Except' module specifically. If you just want the 'mtl' class \
instances for 'ExceptT', use 'transformers-compat' instead, since 'mtl-compat' \
does nothing but reexport the instances from that package. \
 \
Note that unlike how 'mtl-2.2' or later works, the 'Control.Monad.Except' \
module defined in this package exports all of 'ExceptT''s monad class \
instances. Therefore, you may have to declare 'import Control.Monad.Except ()' \
at the top of your file to get all of the 'ExceptT' instances in scope."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "ghc-mtl-compat-0.2.2-1.6.aarch64.rpm"
RPM_HASH = "d7c1518da1bee09a008e650735e2bf418ad56326f644e94ab495eaace489e14bc2a2f7f3b0136bd418091386ba46c6ebdbdfed7e1e83edf92a75ae74c06c88f0"

RPROVIDES:${PN} += "ghc-mtl-compat"

RDEPENDS:${PN} += ""

inherit rpm
