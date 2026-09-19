SUMMARY = "Javadoc for mimepull"
DESCRIPTION = "This package contains the API documentation for mimepull."
LICENSE = "BSD-3-Clause"

PV = "1.10.0"

RPM_NAME = "mimepull-javadoc-1.10.0-1.7.noarch.rpm"
RPM_HASH = "c815a932b22cbccda183e5e8bd44e135cb4994499f301ef7fa5387c2b60b0934e59b3bf9ae972ff75be5144dd1350756fcb372ac0dcf3d2cbbc8d286d7cca792"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mimepull-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
