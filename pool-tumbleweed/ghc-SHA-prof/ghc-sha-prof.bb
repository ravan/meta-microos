SUMMARY = "Haskell SHA profiling library"
DESCRIPTION = "This package provides the Haskell SHA profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.6.4.4"

RPM_NAME = "ghc-SHA-prof-1.6.4.4-8.23.aarch64.rpm"
RPM_HASH = "3b7db8aac7ca6e089b718a896bbd6084cc8c583d82213f2c4e497659ea8e8c81ac786d700fdaf51a3721b4585cecd7a7a901468f8b1e923e2808b7987528b7ff"

RPROVIDES:${PN} += "ghc-SHA-prof \
ghc-prof-SHA-1.6.4.4-F68cMQUf1qw5myCdTNffCM"

RDEPENDS:${PN} += "ghc-SHA-devel \
ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-binary-0.8.9.3-9861 \
ghc-prof-bytestring-0.12.2.0-65be"

inherit rpm
