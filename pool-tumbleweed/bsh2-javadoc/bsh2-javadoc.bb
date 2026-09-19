SUMMARY = "Javadoc for bsh2"
DESCRIPTION = "Scripting for Java (BeanShell Version 2.x) (Java Documentation)."
LICENSE = "LGPL-2.0-or-later | SPL-1.0"

PV = "2.1.1"

RPM_NAME = "bsh2-javadoc-2.1.1-2.9.noarch.rpm"
RPM_HASH = "a3ddcf0ab5f7f7407e71374dc0d1fe9f4856a1f614734b04778ebdfec131886760e5c2447212530b4da292842934e6233fdb84654ef193ca085789ac4b901f67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bsh2-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
