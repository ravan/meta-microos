SUMMARY = "Javadoc for uimaj"
DESCRIPTION = "This package contains javadoc for uimaj."
LICENSE = "Apache-2.0"

PV = "3.5.0"

RPM_NAME = "uimaj-javadoc-3.5.0-6.1.noarch.rpm"
RPM_HASH = "aee23240e61dfc2b80282913f959a2530c1d382feb7bc77733dd05df3c8f4f84cfc62579917c9db810e0c63c55f09b3e313d4310ac272e5b26c1c7d41b350dcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "uimaj-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
