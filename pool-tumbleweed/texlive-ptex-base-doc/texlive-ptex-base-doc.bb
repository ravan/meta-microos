SUMMARY = "Documentation for texlive-ptex-base"
DESCRIPTION = "This package includes the documentation for texlive-ptex-base"
LICENSE = "BSD-3-Clause"

PV = "2026.226.svn64072"

RPM_NAME = "texlive-ptex-base-doc-2026.226.svn64072-60.4.noarch.rpm"
RPM_HASH = "d527898838abc109fcb703ff4846a924535af2763137f4107ec8b8a55bc82afe60df0398f7ce2513f99abb62ee5769c052b2eeaf7e2745afa33fb7eede48df6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ptex-base-doc"

RDEPENDS:${PN} += ""

inherit rpm
