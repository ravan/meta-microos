SUMMARY = "Javadoc for jnr-posix"
DESCRIPTION = "Javadoc for jnr-posix."
LICENSE = "CPL-1.0 | GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "3.1.16"

RPM_NAME = "jnr-posix-javadoc-3.1.16-4.4.noarch.rpm"
RPM_HASH = "d7ec32137a68770c6b08a7c51176fa171acaf3e5a8f6a7cbd55a38f1405e9cedf63f5fa5af1a3acdee9785a172afdd66e801c23199ee6496ba94a3b18c27794f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-posix-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
