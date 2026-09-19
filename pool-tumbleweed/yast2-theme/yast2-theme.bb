SUMMARY = "YaST2 - Theme"
DESCRIPTION = "Contains necessary theming resources to use YaST2."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-only & GPL-3.0-only"

PV = "5.0.2"

RPM_NAME = "yast2-theme-5.0.2-1.2.noarch.rpm"
RPM_HASH = "7f0431c787bf395f8a404df265886fe0691974a3184bb445d3f69f514fc2b24ccb6c50b8b8a5796a395bf1a7ec44c57ea18090560914a25d0a9c02eb51c68188"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-yast2-theme \
yast2-branding \
yast2-theme"

RDEPENDS:${PN} += "/usr/bin/sh \
google-poppins-fonts \
hicolor-icon-theme \
yast2-qt-branding"

inherit rpm
