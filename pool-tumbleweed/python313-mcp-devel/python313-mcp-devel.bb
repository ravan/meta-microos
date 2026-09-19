SUMMARY = "Executables for python313-mcp"
DESCRIPTION = "This package contains the executables for python313-mcp."
LICENSE = "MIT"

PV = "1.28.1"

RPM_NAME = "python313-mcp-devel-1.28.1-1.3.noarch.rpm"
RPM_HASH = "1c5bcc06add755580d43cc8539e2d06a31223cf052926ef7fabf862bafa7179fca4def5607675d464c92f6cca8221e9a63fafca09a44b0f69ca3e84db8b1f9e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mcp-devel \
python313-mcp-devel"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
update-alternatives"

inherit rpm
