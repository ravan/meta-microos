SUMMARY = "Documentation for texlive-feyn"
DESCRIPTION = "This package includes the documentation for texlive-feyn"
LICENSE = "BSD-3-Clause"

PV = "2026.226.0.0.4.3svn63945"

RPM_NAME = "texlive-feyn-doc-2026.226.0.0.4.3svn63945-59.2.noarch.rpm"
RPM_HASH = "50f217b3589b12ff1051fd3a9f32020e7a96789a95ea23bb66138b37bca87dc863d0c2de329a0d211fb32139fd87739095451d42af92d5b2af7f33c59f566b04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-feyn-doc"

RDEPENDS:${PN} += ""

inherit rpm
