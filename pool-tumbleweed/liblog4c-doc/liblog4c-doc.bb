SUMMARY = "Documentation for log4c"
DESCRIPTION = "The liblog4c-doc package contains the log4c documentation."
LICENSE = "LGPL-2.1+"

PV = "1.2.4"

RPM_NAME = "liblog4c-doc-1.2.4-5.38.aarch64.rpm"
RPM_HASH = "dbbe6bd69b14938ee6c7ad9ccd17d003b416239f20ea80a7c5848aaa5ecdb0105a02672500ccc721e22aeae6ef73b8a6d7bf3f704ca30cd142c3ac62bef6278c"

RPROVIDES:${PN} += "liblog4c-doc"

RDEPENDS:${PN} += "liblog4c3"

inherit rpm
