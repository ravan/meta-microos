SUMMARY = "ASM support for bsh2"
DESCRIPTION = "Scripting for Java (BeanShell Version 2.x) (ASM support)."
LICENSE = "LGPL-2.0-or-later | SPL-1.0"

PV = "2.1.1"

RPM_NAME = "bsh2-classgen-2.1.1-2.9.noarch.rpm"
RPM_HASH = "97b059c015221e6cdcaa19986e8b4d68f7f7acb6a0a64cfc3fc25e3b243c4e1aecb4dde4091b23ee0f6911f25ebc72c52cbc64b87c4653f851f0f4cb6a83d4aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bsh2-classgen"

RDEPENDS:${PN} += ""

inherit rpm
