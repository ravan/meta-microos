SUMMARY = "Haskell filepattern profiling library"
DESCRIPTION = "This package provides the Haskell filepattern profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "ghc-filepattern-prof-0.1.3-2.36.aarch64.rpm"
RPM_HASH = "ab330b0d627c4b1fd7510e3205533b0868441dd54cc9381a6f5603d8a5b5ea8de870e32e86e4498a6c4563d7ed298e7eba8cbbc557bc36ae55f04a279bd0c266"

RPROVIDES:${PN} += "ghc-filepattern-prof \
ghc-prof-filepattern-0.1.3-KZHQp0sesewHup360RGBuM"

RDEPENDS:${PN} += "ghc-filepattern-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-extra-1.8.1-J47FlDu75Mb8OlFkJuPlkW \
ghc-prof-filepath-1.5.5.0-b25b"

inherit rpm
