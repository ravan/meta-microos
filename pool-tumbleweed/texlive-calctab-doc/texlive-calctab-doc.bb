SUMMARY = "Documentation for texlive-calctab"
DESCRIPTION = "This package includes the documentation for texlive-calctab"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6.1svn15878"

RPM_NAME = "texlive-calctab-doc-2026.226.0.0.6.1svn15878-59.2.noarch.rpm"
RPM_HASH = "bb58dc08d590595199b4b9e5037e33df6c0df4b07b96626af08fc45f59ee2aefce32dc7db93ee5eb3d966fe882745eb99eb1948f98b2dac6adb82b4f90dd87cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-calctab-doc"

RDEPENDS:${PN} += ""

inherit rpm
