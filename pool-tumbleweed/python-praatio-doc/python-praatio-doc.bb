SUMMARY = "Documentation files for praatio"
DESCRIPTION = "HTML Documentation and examples for praatio."
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python-praatio-doc-4.1.0-3.5.noarch.rpm"
RPM_HASH = "88e758a8f6ce6451b33c084f7e3aca85c8167140901cc392ef63ec96c2e4327db6dd45f736942731b85db0880417ef4c5191ede0254b42ca88a61568634fe7c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-praatio-doc \
python313-praatio-doc \
python314-praatio-doc"

RDEPENDS:${PN} += ""

inherit rpm
