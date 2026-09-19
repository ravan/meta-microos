SUMMARY = "Haskell yesod-static profiling library"
DESCRIPTION = "This package provides the Haskell yesod-static profiling library."
LICENSE = "MIT"

PV = "1.6.1.3"

RPM_NAME = "ghc-yesod-static-prof-1.6.1.3-1.5.aarch64.rpm"
RPM_HASH = "2ff0f295265870c9e9473d9fa0ab2a0290a959ef4c5987adab2da97c769206339fd7a87f6dc5850aa9d6f46119ef88c90d008695179def39fc6640d1e2734cfc"

RPROVIDES:${PN} += "ghc-prof-yesod-static-1.6.1.3-9noSySaJsVKKGGZ3TtCUj8 \
ghc-yesod-static-prof"

RDEPENDS:${PN} += "ghc-prof-async-2.2.6-4fW0sXrepSt4QxgAnnLVB6 \
ghc-prof-attoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-base64-bytestring-1.2.1.0-9fPiMCS8Y4g8itFjJTGk2y \
ghc-prof-blaze-builder-0.4.4.1-DHhu3j9nndC9LUZIrPJCEG \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-conduit-1.3.6.1-DuJaiNNDon54jV6QjcNayt \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-crypton-1.1.4-CRp9zIWu5CJCaPWpwBhIPB \
ghc-prof-crypton-conduit-0.3.0-ID9cpdbxIMIJwDEvCNr6mu \
ghc-prof-css-text-0.1.3.0-H6znMdaU8xkJgIqMcqUC7W \
ghc-prof-data-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-file-embed-0.0.16.0-JqsWezc6wrB9rh480YKWnn \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-prof-hjsmin-0.2.1-8bKwnYn2QQi2TYSbwT5Kau \
ghc-prof-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM \
ghc-prof-memory-0.18.0-4OCVGiXkS6t9StTfiwlZlu \
ghc-prof-mime-types-0.1.2.2-6XnqAsimqz1GLkPrdggNkp \
ghc-prof-process-1.6.26.1-905d \
ghc-prof-ram-0.22.0-4Io46KcWliV5ncwh4lemlr \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-unix-compat-0.7.4.1-4v781Gok1KY8Kg7jV1j1vn \
ghc-prof-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-prof-wai-3.2.4-Is1UVC1czjX2cAufnl3tJW \
ghc-prof-wai-app-static-3.1.9.1-79h1qWsU2OJ8maZZtyFIQX \
ghc-prof-yesod-core-1.6.29.1-6DqdyPYDE9N9BEzGBhDP9D \
ghc-yesod-static-devel"

inherit rpm
