SUMMARY = "Javadoc for stringtemplate4"
DESCRIPTION = "This package contains javadoc for stringtemplate4."
LICENSE = "BSD-3-Clause"

PV = "4.3.3"

RPM_NAME = "stringtemplate4-javadoc-4.3.3-3.6.noarch.rpm"
RPM_HASH = "3725a9b1f74af49c2cda6191b36cf1f85fe84c3e7aa53e67137d65fc25816f83d029bd982b2488362c5a503b6c626ef39bb49dc648985d46728cf3d073b0fb43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "stringtemplate4-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
