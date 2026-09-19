SUMMARY = "API documentation for jsch-agent-proxy"
DESCRIPTION = "This package provides API documentation for jsch-agent-proxy."
LICENSE = "BSD-3-Clause"

PV = "0.0.9"

RPM_NAME = "jsch-agent-proxy-javadoc-0.0.9-2.8.noarch.rpm"
RPM_HASH = "8437e8be38753695f4c511a7c868c5fb142b4256960fcf393ddd30a5986778988ae600d9dd0ac5df58fca4133a649c1eb8f117704bb225687c742f8f2d8e9408"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsch-agent-proxy-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
