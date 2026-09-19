SUMMARY = "Documentation for texlive-mfpic"
DESCRIPTION = "This package includes the documentation for texlive-mfpic"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.10svn28444"

RPM_NAME = "texlive-mfpic-doc-2026.226.1.10svn28444-61.2.noarch.rpm"
RPM_HASH = "9289b466abbce12443835db440465b7b8e94334cfcfbe6aa4dd0e159204d95c457c665f7442917e084461407f1ff64b34de384e6f4eb8bc5548d273fa8838535"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-mfpic-doc-en \
texlive-mfpic-doc"

RDEPENDS:${PN} += ""

inherit rpm
