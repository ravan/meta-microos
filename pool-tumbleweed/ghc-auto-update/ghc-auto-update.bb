SUMMARY = "Efficiently run periodic, on-demand actions"
DESCRIPTION = "API docs and the README are available at \
<http://www.stackage.org/package/auto-update>."
LICENSE = "MIT"

PV = "0.2.6"

RPM_NAME = "ghc-auto-update-0.2.6-1.15.aarch64.rpm"
RPM_HASH = "be872be255066048311fc1fb1cb3f0702a089130e526569b1cf054cb113230d83ccd01fdfea6e0c22dece94c312fd163dea81ea10705d256fe6c4d2baf8ce805"

RPROVIDES:${PN} += "ghc-auto-update \
libHSauto-update-0.2.6-2tH9dVxiiOkBVROYgrOYPc-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
