SUMMARY = "Documentation files for Orthanc"
DESCRIPTION = "This package includes the documentation and the sample codes available \
for Orthanc. \
It also includes the Python and LUA Scripts, and the documentation to develop \
C/C++ plugins for Orthanc."
LICENSE = "GPL-3.0-or-later"

PV = "1.13.0"

RPM_NAME = "orthanc-doc-1.13.0-1.2.noarch.rpm"
RPM_HASH = "5d7a63dee7a9ee2d10cf92e3efea09711dfe698f80bced624c09be751fb3f2d83da822edbc6f44bedb2de1110b23755ce505b190bed904fdde6fe54f6e577184"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "orthanc-doc"

RDEPENDS:${PN} += "group-orthanc \
user-orthanc"

inherit rpm
