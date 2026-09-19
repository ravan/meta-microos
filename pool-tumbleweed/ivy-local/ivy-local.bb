SUMMARY = "Local mode for Apache Ivy"
DESCRIPTION = "This meta-package pulls in macros, scripts and dependencies \
implementing local mode for Apache Ivy, which allows \
artifact resolution using XMvn resolver."
LICENSE = "BSD-3-Clause"

PV = "6.2.0"

RPM_NAME = "ivy-local-6.2.0-1.9.noarch.rpm"
RPM_HASH = "e08ef40abbded3ba3b38e6d83321be928f707f2f92dddae51169ec08683c95bd2fa84d7510015f84a8b6f2897ca6b84a52d81aa13e9ca53328b06f628800e27c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ivy-local"

RDEPENDS:${PN} += "ant \
apache-ivy \
javapackages-ivy \
xmvn-connector-ivy \
xmvn-install \
xmvn-resolve"

inherit rpm
