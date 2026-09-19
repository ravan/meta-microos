SUMMARY = "Documentation for texlive-python"
DESCRIPTION = "This package includes the documentation for texlive-python"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.22svn60162"

RPM_NAME = "texlive-python-doc-2026.226.0.0.22svn60162-60.4.noarch.rpm"
RPM_HASH = "7b74c7df4156f80cc2785a6b506f9441fea5c4d05cbaf17940387ea3ac743de058133fef6635f9ea699fd2cceb174b9010489e43b69eb293a1940c8535cb9c07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-python-doc"

RDEPENDS:${PN} += ""

inherit rpm
