SUMMARY = "Javadoc for extra166y"
DESCRIPTION = "This package contains javadoc for extra166y."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "1.7.0"

RPM_NAME = "extra166y-javadoc-1.7.0-6.2.noarch.rpm"
RPM_HASH = "798d91838285e9b38e4c9bc95c2c6d041ba04a6a68bc9b8dc6093c9665a2aae2e47c44171f7794fc40e74ba07ba323a0244d42599b91da12ec759f134cb06933"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "extra166y-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
