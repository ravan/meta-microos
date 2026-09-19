SUMMARY = "BSF support for bsh2"
DESCRIPTION = "Scripting for Java (BeanShell Version 2.x) (BSF support)."
LICENSE = "LGPL-2.0-or-later | SPL-1.0"

PV = "2.1.1"

RPM_NAME = "bsh2-bsf-2.1.1-2.9.noarch.rpm"
RPM_HASH = "5aeaeb9aec92f7f801be907f5a8d140e29b5aa78452707cb18bbc652976dd632531fb55588bb6ef8265f1cff4186e55c7e1d66d092d25ae5667ef977093bf351"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bsh2-bsf"

RDEPENDS:${PN} += "bsf"

inherit rpm
