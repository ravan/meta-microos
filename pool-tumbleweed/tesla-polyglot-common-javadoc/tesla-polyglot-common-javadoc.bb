SUMMARY = "Javadoc for tesla-polyglot-common"
DESCRIPTION = "This package contains javadoc for tesla-polyglot-common."
LICENSE = "EPL-1.0"

PV = "0.4.5"

RPM_NAME = "tesla-polyglot-common-javadoc-0.4.5-2.7.noarch.rpm"
RPM_HASH = "2886287dfea650c0b5bdeeea785ffd04a02fdcf234433e546261b1435f78918fbf468f39c553600b4cb66f97bc0d59c62b59c325d5ff5de8c095dea3bee65077"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesla-polyglot-common-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
