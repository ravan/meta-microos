SUMMARY = "Haskell hlint library development files"
DESCRIPTION = "This package provides the Haskell hlint library development files."
LICENSE = "BSD-3-Clause"

PV = "3.10"

RPM_NAME = "ghc-hlint-devel-3.10-1.17.aarch64.rpm"
RPM_HASH = "6276016545bcd2d1ba8dd030f86ac30ccb430372e350099c990d7cd74fd8f19bd616210d9dfcfcd457b8ed31c37a81ff5842845c6358d161f10a1efb75b147c7"

RPROVIDES:${PN} += "ghc-devel-hlint-3.10-1bXi3hD8i4N69pE8phCza6 \
ghc-hlint-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-devel-ansi-terminal-1.1.5-KiVHPj6W9e81bxE9dBsVtZ \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-cmdargs-0.10.22-HkrnpmTZ18VE75B7wmB8rg \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-cpphs-1.20.10-CewphWkQP3qH9WB1ikGBAW \
ghc-devel-data-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ \
ghc-devel-deriving-aeson-0.2.10-A2Hr72Vk9XP91w802TwQUN \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-extra-1.8.1-J47FlDu75Mb8OlFkJuPlkW \
ghc-devel-file-embed-0.0.16.0-JqsWezc6wrB9rh480YKWnn \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-filepattern-0.1.3-KZHQp0sesewHup360RGBuM \
ghc-devel-ghc-lib-parser-9.12.3.20251228-A26EZnaiNey14MMYQvPU7L \
ghc-devel-ghc-lib-parser-ex-9.12.0.0-AQFnDqoQhTuCgXxh1T0SWZ \
ghc-devel-hscolour-1.25-7g5wxbCbTVu2XnpAXvjFVU \
ghc-devel-process-1.6.26.1-905d \
ghc-devel-refact-0.3.0.2-BbwdNckJT1UJcRbLtga6Lt \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-uniplate-1.6.13-FhUIjk7rCCk8dCOMm0dejl \
ghc-devel-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-devel-utf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG \
ghc-devel-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-devel-yaml-0.11.11.2-DNw228htw8L33w1OC1EWSt \
ghc-hlint"

inherit rpm
