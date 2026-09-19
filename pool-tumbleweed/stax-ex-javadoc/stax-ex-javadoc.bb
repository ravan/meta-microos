SUMMARY = "Javadoc for stax-ex"
DESCRIPTION = "This package contains javadoc for stax-ex."
LICENSE = "CDDL-1.0 | GPL-2.0-only"

PV = "1.8"

RPM_NAME = "stax-ex-javadoc-1.8-7.6.noarch.rpm"
RPM_HASH = "4b315eeb488c97cc866a73f49ae1b29b2846791d08ecdd36ab9cec6c9e62ec1684e8f55788e97e924d802cb500c28092f3534c59145e3742eb124240e53e3948"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "stax-ex-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
