SUMMARY = "Documentation for texlive-fontawesomescaled"
DESCRIPTION = "This package includes the documentation for texlive-fontawesomescaled"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.1svn75980"

RPM_NAME = "texlive-fontawesomescaled-doc-2026.226.0.0.1.1svn75980-60.2.noarch.rpm"
RPM_HASH = "33d1792afe3a0a771b41c2ffd196c8e5f1632c437baf9903d23a5b8ba9c5e9cef856462a855542b70606e1fa2df09a26260d7a7351286d689ff703f4149517ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fontawesomescaled-doc"

RDEPENDS:${PN} += ""

inherit rpm
