SUMMARY = "Documentation for libdwarf"
DESCRIPTION = "Documentation for libdwarf."
LICENSE = "GPL-2.0-or-later"

PV = "2.3.2"

RPM_NAME = "libdwarf-doc-2.3.2-1.2.noarch.rpm"
RPM_HASH = "31f481d577da8c92022ac0c2a9ec28da8d48b86ce3b430c27fe55d825420893058c12bcba4c270fd2286a818c0d93e5978cc4796fe86bdb2570d312b3665ff0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libdwarf-doc"

RDEPENDS:${PN} += ""

inherit rpm
