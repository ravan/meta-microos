SUMMARY = "Documentation for OpenShadingLanguage"
DESCRIPTION = "Open Shading Language (OSL) is a language for programmable shading \
in advanced renderers and other applications, ideal for describing \
materials, lights, displacement, and pattern generation. \
This package contains documentation."
LICENSE = "CC-BY-3.0"

PV = "1.15.4.0"

RPM_NAME = "OpenShadingLanguage-doc-1.15.4.0-3.1.noarch.rpm"
RPM_HASH = "76bc1061abf0f49964aa6c7978bfcbbf63f61a64e4eb2ccdd15135f241ebd387a1ac68931ec4a9b619a93b5dc188ffb7c4b785629b5c75b8b0a8703369c7638f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "OpenShadingLanguage-doc"

RDEPENDS:${PN} += "OpenShadingLanguage"

inherit rpm
