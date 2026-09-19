SUMMARY = "Documentation for texlive-etexcmds"
DESCRIPTION = "This package includes the documentation for texlive-etexcmds"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7svn78101"

RPM_NAME = "texlive-etexcmds-doc-2026.226.1.7svn78101-59.2.noarch.rpm"
RPM_HASH = "5c7a76775b5ccf5adc7645b0ea63fdcfb965960a383680c12b2c9e9898b5bbf3db3c623412ba1751674be8485914e8f5a57912698b686f0922321671a2307ad0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-etexcmds-doc"

RDEPENDS:${PN} += ""

inherit rpm
