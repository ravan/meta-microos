SUMMARY = "Optional, additional dictionaries for SKK"
DESCRIPTION = "optional, additional dictionaries for SKK."
LICENSE = "Unicode-DFS-2016"

PV = "20240829"

RPM_NAME = "skkdic-extra-20240829-2.4.noarch.rpm"
RPM_HASH = "8944fe98e9616cc3820898bb24e977a5c8111e9901dbbe27ceedb81d57291410723363d7228caa07831a89ee69c0c9804d54627c3c7d51557474f87167560934"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "skkdic-extra"

RDEPENDS:${PN} += "info"

inherit rpm
