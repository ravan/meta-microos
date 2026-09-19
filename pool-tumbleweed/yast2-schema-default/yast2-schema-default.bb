SUMMARY = "YaST2 - AutoYaST Schema (default variant)"
DESCRIPTION = "AutoYaST Syntax Schema (default variant)"
LICENSE = "GPL-2.0-or-later"

PV = "5.0.3"

RPM_NAME = "yast2-schema-default-5.0.3-1.6.aarch64.rpm"
RPM_HASH = "18b5271c0716aaa57311f588a635749837c2e93729b1b83d30eea454334d7d5d5be31402a12837a7bfaef07bf55670b742da82426ee1e3dc987e9a14d627b049"

RPROVIDES:${PN} += "yast2-schema \
yast2-schema-default"

RDEPENDS:${PN} += ""

inherit rpm
