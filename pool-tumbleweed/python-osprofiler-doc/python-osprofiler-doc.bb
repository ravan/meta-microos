SUMMARY = "Documentation for OSProfiler"
DESCRIPTION = "Documentation for OSProfiler."
LICENSE = "Apache-2.0"

PV = "4.4.0"

RPM_NAME = "python-osprofiler-doc-4.4.0-1.1.noarch.rpm"
RPM_HASH = "94a4e59b197e169dcff7c92bce19fa9b0533762161f0eb77fba3a799b777655436b124b6cee940c9ef678add29fce5cbca5ecd5254330ae4c46c8e85e8d2be52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-osprofiler-doc"

RDEPENDS:${PN} += ""

inherit rpm
