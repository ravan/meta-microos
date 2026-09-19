SUMMARY = "Haskell yesod-static library development files"
DESCRIPTION = "This package provides the Haskell yesod-static library development files."
LICENSE = "MIT"

PV = "1.6.1.3"

RPM_NAME = "ghc-yesod-static-devel-1.6.1.3-1.5.aarch64.rpm"
RPM_HASH = "5e7731ebbb38354b5e658a4d0b9d5ada84292135f9dff39d5745050b3c9c1fb3f25a098f7eda0fc1a8caad5411d6c376a24fd8ac1dd87d0c5561ed6d492049d2"

RPROVIDES:${PN} += "ghc-devel-yesod-static-1.6.1.3-9noSySaJsVKKGGZ3TtCUj8 \
ghc-yesod-static-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-async-2.2.6-4fW0sXrepSt4QxgAnnLVB6 \
ghc-devel-attoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-base64-bytestring-1.2.1.0-9fPiMCS8Y4g8itFjJTGk2y \
ghc-devel-blaze-builder-0.4.4.1-DHhu3j9nndC9LUZIrPJCEG \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-conduit-1.3.6.1-DuJaiNNDon54jV6QjcNayt \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-crypton-1.1.4-CRp9zIWu5CJCaPWpwBhIPB \
ghc-devel-crypton-conduit-0.3.0-ID9cpdbxIMIJwDEvCNr6mu \
ghc-devel-css-text-0.1.3.0-H6znMdaU8xkJgIqMcqUC7W \
ghc-devel-data-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-file-embed-0.0.16.0-JqsWezc6wrB9rh480YKWnn \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-devel-hjsmin-0.2.1-8bKwnYn2QQi2TYSbwT5Kau \
ghc-devel-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM \
ghc-devel-memory-0.18.0-4OCVGiXkS6t9StTfiwlZlu \
ghc-devel-mime-types-0.1.2.2-6XnqAsimqz1GLkPrdggNkp \
ghc-devel-process-1.6.26.1-905d \
ghc-devel-ram-0.22.0-4Io46KcWliV5ncwh4lemlr \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-unix-compat-0.7.4.1-4v781Gok1KY8Kg7jV1j1vn \
ghc-devel-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-devel-wai-3.2.4-Is1UVC1czjX2cAufnl3tJW \
ghc-devel-wai-app-static-3.1.9.1-79h1qWsU2OJ8maZZtyFIQX \
ghc-devel-yesod-core-1.6.29.1-6DqdyPYDE9N9BEzGBhDP9D \
ghc-yesod-static"

inherit rpm
