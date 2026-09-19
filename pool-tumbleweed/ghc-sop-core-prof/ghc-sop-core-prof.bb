SUMMARY = "Haskell sop-core profiling library"
DESCRIPTION = "This package provides the Haskell sop-core profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.2"

RPM_NAME = "ghc-sop-core-prof-0.5.0.2-8.3.aarch64.rpm"
RPM_HASH = "8d252daad56bc7aa90de59922fdf8cd17cbbcbc349822742fb8c0927242f1ac4225f9459eddb6895eaa5daa85fd45a107d90f9fa0dedcc58092139b6f6b6cf7a"

RPROVIDES:${PN} += "ghc-prof-sop-core-0.5.0.2-JbzyU3U5Jc9a9b8Omhy6m \
ghc-sop-core-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-sop-core-devel"

inherit rpm
