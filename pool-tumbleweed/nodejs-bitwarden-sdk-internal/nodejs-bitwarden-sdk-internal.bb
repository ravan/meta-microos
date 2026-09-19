SUMMARY = "Bitwarden WASM module — development files"
DESCRIPTION = "WebAssembly module used by Bitwarden — NodeJS bindings and TypeScript headers \
This package does not provide a stable API and is only intended for building the Bitwarden desktop application."
LICENSE = "(Apache-2.0 | MIT) & (CC0-1.0 | MIT) & GPL-3.0-only"

PV = "0.2.0~main.311"

RPM_NAME = "nodejs-bitwarden-sdk-internal-0.2.0~main.311-1.9.noarch.rpm"
RPM_HASH = "ff39ccc8acd4f48d0392dc4d0d2d872c5037e04d6c30c8d6a3b7692e86c92d3fb687afe02d9879f12f21be2ae4cc9ef75855cd29572fd495954dbd1c5edf770a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nodejs-bitwarden-sdk-internal \
npm-@bitwarden/sdk-internal \
own-type-fest"

RDEPENDS:${PN} += "bitwarden-sdk-internal \
nodejs-engine"

inherit rpm
