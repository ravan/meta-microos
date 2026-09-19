SUMMARY = "Documentation for texlive-texblend"
DESCRIPTION = "This package includes the documentation for texlive-texblend"
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.1svn68961"

RPM_NAME = "texlive-texblend-doc-2026.227.0.0.1svn68961-62.2.noarch.rpm"
RPM_HASH = "acc958ca935e09790b56aa595b70074b591507645c242c067161275967e5c083edb3915efc3f71bb51c1ede3642df04b9af90487d2cb0e30e5c3e0d6e2c1b26d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texblend-doc"

RDEPENDS:${PN} += ""

inherit rpm
