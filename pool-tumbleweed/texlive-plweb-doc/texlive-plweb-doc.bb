SUMMARY = "Documentation for texlive-plweb"
DESCRIPTION = "This package includes the documentation for texlive-plweb"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0svn15878"

RPM_NAME = "texlive-plweb-doc-2026.226.3.0svn15878-59.2.noarch.rpm"
RPM_HASH = "ec3558ba20cf538732060846e2cb0232118ef6c18b7a7163aa9d8f5fa181ca9407b69924e66354560d9010c3640f39b0f76a6ba3006c3ec513bf730481cf5263"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-plweb-doc"

RDEPENDS:${PN} += ""

inherit rpm
