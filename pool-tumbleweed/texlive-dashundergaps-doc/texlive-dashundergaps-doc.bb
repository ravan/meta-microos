SUMMARY = "Documentation for texlive-dashundergaps"
DESCRIPTION = "This package includes the documentation for texlive-dashundergaps"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0hsvn77682"

RPM_NAME = "texlive-dashundergaps-doc-2026.226.2.0hsvn77682-61.2.noarch.rpm"
RPM_HASH = "b9815292733d3dc59b65d238b3ceb3d29191be73576b010a131e5d9baae46d79676dc337d327e899698e60c58c2ec9333ea247f147b35a474ed68fc2c060422a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dashundergaps-doc"

RDEPENDS:${PN} += ""

inherit rpm
