SUMMARY = "Haskell hledger-ui library development files"
DESCRIPTION = "This package provides the Haskell hledger-ui library development files."
LICENSE = "GPL-3.0-or-later"

PV = "1.52.1"

RPM_NAME = "ghc-hledger-ui-devel-1.52.1-2.4.aarch64.rpm"
RPM_HASH = "27508602931416da2a50d3b0e7110e92b4178c5d343a6b734282d11251c9c9d7f1f9a75b1dbc86a2eeb3a7a47d8f68f353f3a092a81362f121218bf091e4711c"

RPROVIDES:${PN} += "ghc-devel-hledger-ui-1.52.1-5ycwQVeQ8BcL7OH5vfRsDM \
ghc-hledger-ui-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-ansi-terminal-1.1.5-KiVHPj6W9e81bxE9dBsVtZ \
ghc-devel-async-2.2.6-4fW0sXrepSt4QxgAnnLVB6 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-brick-2.12-LgticZ12Zph9E2wGepOKBH \
ghc-devel-cmdargs-0.10.22-HkrnpmTZ18VE75B7wmB8rg \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-data-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-doclayout-0.5.0.3-6oU5Og9jiD67xwlm4qJ1ii \
ghc-devel-extra-1.8.1-J47FlDu75Mb8OlFkJuPlkW \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-fsnotify-0.4.4.0-LuHPyjr4QGh136VBBqYNbJ \
ghc-devel-githash-0.1.7.0-CZogn6tBFSRH7zyPP5YHJu \
ghc-devel-hledger-1.52.1-7DZpaHQwuFEDioGQhnO8CW \
ghc-devel-hledger-lib-1.52.1-4wPwI3AerCQ9IUzBwQug \
ghc-devel-megaparsec-9.7.1-3bWkE5RywYh6b8gn4lQrB6 \
ghc-devel-microlens-0.5.0.0-K1fQqqDyjwS5maOWIXQxx3 \
ghc-devel-microlens-platform-0.4.4.2-FHpyH8J1vkX1PJSxWPZ8RH \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-process-1.6.26.1-905d \
ghc-devel-safe-0.3.21-AzRUUYeJ47sQc55olWnva \
ghc-devel-split-0.2.5-DF0qBqNymX3Hv5Ta0307xc \
ghc-devel-stm-2.5.3.1-6d74 \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-text-zipper-0.13-HJrIfnTzHLAGK5wSCeeQus \
ghc-devel-time-1.14-a7dc \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-unix-2.8.8.0-178a \
ghc-devel-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-devel-vty-6.6-EPyV4ZsVRx8EnXBLhcE4eO \
ghc-devel-vty-crossplatform-0.4.0.0-DfPElrORw2a1ydk7gC4Op8 \
ghc-hledger-ui"

inherit rpm
