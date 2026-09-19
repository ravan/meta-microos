SUMMARY = "Documentation for texlive-uptex-base"
DESCRIPTION = "This package includes the documentation for texlive-uptex-base"
LICENSE = "BSD-3-Clause"

PV = "2026.226.svn77840"

RPM_NAME = "texlive-uptex-base-doc-2026.226.svn77840-60.2.noarch.rpm"
RPM_HASH = "33e524f1abce6f094b32ebb35fb800d3f08a865550dba92a214ba33f6e984f506e28447a900c8429a23aab5cc265e9acedae333c0e864f27d85d7cb370dc2831"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uptex-base-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
