SUMMARY = "Qt based cross-platform GUI proxy configuration manager (backend: sing-box)"
DESCRIPTION = "Qt based cross-platform GUI proxy configuration manager (backend: sing-box)."
LICENSE = "GPL-3.0-only"

PV = "5.11.28.2"

RPM_NAME = "nekobox-lang-5.11.28.2-1.1.aarch64.rpm"
RPM_HASH = "398387076e05efe9247d6b9f7ab9996bbdb933399fe8f400adc35fd2703af74348cd13021e1a03709ddae528de909ef4b950f148142c0b98de57e1f6b111eede"

RPROVIDES:${PN} += "nekobox-lang"

RDEPENDS:${PN} += ""

inherit rpm
