SUMMARY = "Documentation for texlive-fadingimage"
DESCRIPTION = "This package includes the documentation for texlive-fadingimage"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3asvn75447"

RPM_NAME = "texlive-fadingimage-doc-2026.226.0.0.3asvn75447-59.2.noarch.rpm"
RPM_HASH = "261a777f00bb7f7f0251911fee4da0feba6bd09ff4dbabce100f600ca3f4d4590dbcaae2872e7533c45f9238c1e2fea2c2e71433a5d657a968dfb491b042db61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fadingimage-doc"

RDEPENDS:${PN} += ""

inherit rpm
