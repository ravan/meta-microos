SUMMARY = "Dependencies to build ghc"
DESCRIPTION = "Prebuild alex and happy for bootstrapping the proper ghc build. \
Don't use outside of GHC bootstrapping!"
LICENSE = "BSD-2-Clause & BSD-3-Clause"

PV = "1.4"

RPM_NAME = "ghc-bootstrap-helpers-1.4-1.13.aarch64.rpm"
RPM_HASH = "5fe29a5c1fa1203f674bbe29cffef6c1ad184a9aa90de32d3a012287a0dd6f19b70f1fd90ff4bf7efb3f3efa79a8ac23b75289bb7b42d9f2b7bf05d95d54afeb"

RPROVIDES:${PN} += "ghc-bootstrap-helpers"

RDEPENDS:${PN} += "libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1 \
this-is-only-for-build-envs"

inherit rpm
