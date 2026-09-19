SUMMARY = "Haskell hledger-ui profiling library"
DESCRIPTION = "This package provides the Haskell hledger-ui profiling library."
LICENSE = "GPL-3.0-or-later"

PV = "1.52.1"

RPM_NAME = "ghc-hledger-ui-prof-1.52.1-2.4.aarch64.rpm"
RPM_HASH = "f8539914d1b3f7e67a14ce8c6334c9e67bc8fac8bca27eb6feb520042fba3e10e9614cb5b71a7df3526d5ad6723e7bbb6658a5953ba14b63617d7f61bc92a06d"

RPROVIDES:${PN} += "ghc-hledger-ui-prof \
ghc-prof-hledger-ui-1.52.1-5ycwQVeQ8BcL7OH5vfRsDM"

RDEPENDS:${PN} += "ghc-hledger-ui-devel \
ghc-prof-ansi-terminal-1.1.5-KiVHPj6W9e81bxE9dBsVtZ \
ghc-prof-async-2.2.6-4fW0sXrepSt4QxgAnnLVB6 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-brick-2.12-LgticZ12Zph9E2wGepOKBH \
ghc-prof-cmdargs-0.10.22-HkrnpmTZ18VE75B7wmB8rg \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-data-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-doclayout-0.5.0.3-6oU5Og9jiD67xwlm4qJ1ii \
ghc-prof-extra-1.8.1-J47FlDu75Mb8OlFkJuPlkW \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-fsnotify-0.4.4.0-LuHPyjr4QGh136VBBqYNbJ \
ghc-prof-githash-0.1.7.0-CZogn6tBFSRH7zyPP5YHJu \
ghc-prof-hledger-1.52.1-7DZpaHQwuFEDioGQhnO8CW \
ghc-prof-hledger-lib-1.52.1-4wPwI3AerCQ9IUzBwQug \
ghc-prof-megaparsec-9.7.1-3bWkE5RywYh6b8gn4lQrB6 \
ghc-prof-microlens-0.5.0.0-K1fQqqDyjwS5maOWIXQxx3 \
ghc-prof-microlens-platform-0.4.4.2-FHpyH8J1vkX1PJSxWPZ8RH \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-process-1.6.26.1-905d \
ghc-prof-safe-0.3.21-AzRUUYeJ47sQc55olWnva \
ghc-prof-split-0.2.5-DF0qBqNymX3Hv5Ta0307xc \
ghc-prof-stm-2.5.3.1-6d74 \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-text-zipper-0.13-HJrIfnTzHLAGK5wSCeeQus \
ghc-prof-time-1.14-a7dc \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-unix-2.8.8.0-178a \
ghc-prof-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-prof-vty-6.6-EPyV4ZsVRx8EnXBLhcE4eO \
ghc-prof-vty-crossplatform-0.4.0.0-DfPElrORw2a1ydk7gC4Op8"

inherit rpm
