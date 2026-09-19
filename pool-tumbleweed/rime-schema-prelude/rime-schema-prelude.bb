SUMMARY = "Prelude input schema for rime"
DESCRIPTION = "prelude input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20250315"

RPM_NAME = "rime-schema-prelude-20250315-1.4.noarch.rpm"
RPM_HASH = "d3973c7eda872144f800e019e3c0c2299d4fa68478fecc46bf7027c068f1300c981d39b8103dad2774d10b9f49c10dbdb3b8173c577e72cbe4177181599e1755"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-prelude"

RDEPENDS:${PN} += ""

inherit rpm
