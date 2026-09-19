SUMMARY = "Haskell hjsmin profiling library"
DESCRIPTION = "This package provides the Haskell hjsmin profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-hjsmin-prof-0.2.1-1.29.aarch64.rpm"
RPM_HASH = "041a9e7824d01501d174a20663bdd0f862b8d602931e70e69613ac9c4efc2aeaea673d52bdfe5d6cb0516239ba26119614dd46d657bfeb6ae3e21d4149ca2ec4"

RPROVIDES:${PN} += "ghc-hjsmin-prof \
ghc-prof-hjsmin-0.2.1-8bKwnYn2QQi2TYSbwT5Kau"

RDEPENDS:${PN} += "ghc-hjsmin-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-language-javascript-0.7.1.0-KLLAIgUSnFo2SkJxZVCcjo \
ghc-prof-text-2.1.4-cf23"

inherit rpm
