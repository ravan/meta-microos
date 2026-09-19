SUMMARY = "Documentation for texlive-tkz-bernoulli"
DESCRIPTION = "This package includes the documentation for texlive-tkz-bernoulli"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.3svn73069"

RPM_NAME = "texlive-tkz-bernoulli-doc-2026.226.0.0.1.3svn73069-59.2.noarch.rpm"
RPM_HASH = "c7a9aac6c8465a75cf887a2c98b55b482425342835e0ad0e0d35b3d2b36619699a855e16265d688ba66a47dad635b863df9325a0f1d9043a1d0cb7be9df21afc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tkz-bernoulli-doc"

RDEPENDS:${PN} += ""

inherit rpm
