SUMMARY = "Bitwarden WASM module"
DESCRIPTION = "WebAssembly module used by the Bitwarden desktop application."
LICENSE = "Apache-2.0 & (Apache-2.0 | BSL-1.0) & BSD-3-Clause & GPL-3.0-only & MIT & (MIT | Unlicense) & Unicode-3.0"

PV = "0.2.0~main.311"

RPM_NAME = "bitwarden-sdk-internal-0.2.0~main.311-1.9.noarch.rpm"
RPM_HASH = "ac64ff03eaa11f7f9c3f6e760f67c08927d2e0546e2b082453a3b7c68cbb1816752241c8f1d56a7d68a08694e5dd4009f55877fdd0ed45be73d5fb4e25fa0fec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bitwarden-sdk-internal"

RDEPENDS:${PN} += ""

inherit rpm
