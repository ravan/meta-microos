SUMMARY = "Small Clojure interpreter, linter and formatter written in Go"
DESCRIPTION = "Joker is a small Clojure interpreter, linter and formatter written in Go."
LICENSE = "EPL-1.0"

PV = "1.4.0"

RPM_NAME = "joker-1.4.0-2.10.aarch64.rpm"
RPM_HASH = "0c24f7e98a1f3b83d2207a0d75b275971f5353c295cff6710048b4368923d9df52fee61ee217afafca80d683afbf5567f7eff547b47a7b86d14133c5fa95f473"

RPROVIDES:${PN} += "joker"

RDEPENDS:${PN} += ""

inherit rpm
