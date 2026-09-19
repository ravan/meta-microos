SUMMARY = "Documentation for texlive-turnstile"
DESCRIPTION = "This package includes the documentation for texlive-turnstile"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-turnstile-doc-2026.226.1.0svn77682-59.2.noarch.rpm"
RPM_HASH = "a02a1f60ba4ae43bb982754a41f477190f83986969d7f24b16e9d781da30006d3968e696d45c2c56eabdd4ffe544bf547b7b806beabf109a2e3204184fb719d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-turnstile-doc-pt \
texlive-turnstile-doc"

RDEPENDS:${PN} += ""

inherit rpm
