SUMMARY = "Haskell wai library development files"
DESCRIPTION = "This package provides the Haskell wai library development files."
LICENSE = "MIT"

PV = "3.2.4"

RPM_NAME = "ghc-wai-devel-3.2.4-1.26.aarch64.rpm"
RPM_HASH = "3c9f858166afd8e80600a1d20b3d2ee736c8f182014987b5536af3db72815211e0e5254e145039fbeadecc12e8eb5045237e4ecfd4f94705e84e71cb2dc8f249"

RPROVIDES:${PN} += "ghc-devel-wai-3.2.4-Is1UVC1czjX2cAufnl3tJW \
ghc-wai-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM \
ghc-devel-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-vault-0.3.2.0-GYOqPpJA2DW5Qz2IFtkvei \
ghc-wai"

inherit rpm
