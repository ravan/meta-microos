SUMMARY = "Haskell hlint profiling library"
DESCRIPTION = "This package provides the Haskell hlint profiling library."
LICENSE = "BSD-3-Clause"

PV = "3.10"

RPM_NAME = "ghc-hlint-prof-3.10-1.17.aarch64.rpm"
RPM_HASH = "0ed2746a35d6ba934e7fe03b31dffba8167632007dbc68a4b274c7b3e1d1a512f8b6cd9c69b7e4dc691e1fcb14929fd89e180c2d9fe303d285fb3460b683c780"

RPROVIDES:${PN} += "ghc-hlint-prof \
ghc-prof-hlint-3.10-1bXi3hD8i4N69pE8phCza6"

RDEPENDS:${PN} += "ghc-hlint-devel \
ghc-prof-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-prof-ansi-terminal-1.1.5-KiVHPj6W9e81bxE9dBsVtZ \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-cmdargs-0.10.22-HkrnpmTZ18VE75B7wmB8rg \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-cpphs-1.20.10-CewphWkQP3qH9WB1ikGBAW \
ghc-prof-data-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ \
ghc-prof-deriving-aeson-0.2.10-A2Hr72Vk9XP91w802TwQUN \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-extra-1.8.1-J47FlDu75Mb8OlFkJuPlkW \
ghc-prof-file-embed-0.0.16.0-JqsWezc6wrB9rh480YKWnn \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-filepattern-0.1.3-KZHQp0sesewHup360RGBuM \
ghc-prof-ghc-lib-parser-9.12.3.20251228-A26EZnaiNey14MMYQvPU7L \
ghc-prof-ghc-lib-parser-ex-9.12.0.0-AQFnDqoQhTuCgXxh1T0SWZ \
ghc-prof-hscolour-1.25-7g5wxbCbTVu2XnpAXvjFVU \
ghc-prof-process-1.6.26.1-905d \
ghc-prof-refact-0.3.0.2-BbwdNckJT1UJcRbLtga6Lt \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-uniplate-1.6.13-FhUIjk7rCCk8dCOMm0dejl \
ghc-prof-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-prof-utf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG \
ghc-prof-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-prof-yaml-0.11.11.2-DNw228htw8L33w1OC1EWSt"

inherit rpm
