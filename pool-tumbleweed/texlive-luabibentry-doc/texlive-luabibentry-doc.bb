SUMMARY = "Documentation for texlive-luabibentry"
DESCRIPTION = "This package includes the documentation for texlive-luabibentry"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1asvn55777"

RPM_NAME = "texlive-luabibentry-doc-2026.226.0.0.1asvn55777-59.2.noarch.rpm"
RPM_HASH = "08637d7a9c22d9cdf35259c1e2bf2f85b2a9ece21eebf79a3e390c6d5e7f3755417e510735766733d69a9df3072ac458d6b7b6a56c6a6fcd45bef944f3beb50f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luabibentry-doc"

RDEPENDS:${PN} += ""

inherit rpm
