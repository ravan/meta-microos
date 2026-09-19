SUMMARY = "Development documentation for Hypre"
DESCRIPTION = "This package contains development documentation for Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "3.1.0"

RPM_NAME = "hypre-mvapich2-doc-3.1.0-1.2.noarch.rpm"
RPM_HASH = "f77039360ed8969777c4f330992fa45c1a04c41bf2f680990e4afd958ea55d424b2a65d44aa08c52ce81ccf08093492d450aefd8865c86306a7f48e92d7bcc84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hypre-mvapich2-doc"

RDEPENDS:${PN} += ""

inherit rpm
