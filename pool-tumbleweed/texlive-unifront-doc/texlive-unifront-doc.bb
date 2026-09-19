SUMMARY = "Documentation for texlive-unifront"
DESCRIPTION = "This package includes the documentation for texlive-unifront"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn67054"

RPM_NAME = "texlive-unifront-doc-2026.226.1.0svn67054-60.2.noarch.rpm"
RPM_HASH = "b2c25803908428cea4f08d93dfedc57e5f74d8a2f9865e69492424b4a1fd834ae90df340feef5de4aa9f85c0ba6fb0677dce02b7c79f25369ea94ee3cbf18414"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unifront-doc"

RDEPENDS:${PN} += ""

inherit rpm
