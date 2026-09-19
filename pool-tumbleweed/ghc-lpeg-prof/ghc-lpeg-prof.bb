SUMMARY = "Haskell lpeg profiling library"
DESCRIPTION = "This package provides the Haskell lpeg profiling library."
LICENSE = "MIT"

PV = "1.1.0.1"

RPM_NAME = "ghc-lpeg-prof-1.1.0.1-1.3.aarch64.rpm"
RPM_HASH = "697f14d87115a6242a81e9603751076a2eaec0b9fe9f0576d293a554cdc85872d5c14d61c451d885451039d6093c645bf75a7a5e08a02db44318a4077cf6a140"

RPROVIDES:${PN} += "ghc-lpeg-prof \
ghc-prof-lpeg-1.1.0.1-Jbb90xEfizAEuGHvVCZgbp"

RDEPENDS:${PN} += "ghc-lpeg-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-lua-2.3.4-GxTlN73bN8C8KbBhVEtsew"

inherit rpm
