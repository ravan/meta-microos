SUMMARY = "OSL shader examples"
DESCRIPTION = "Open Shading Language (OSL) is a language for programmable shading \
in advanced renderers and other applications, ideal for describing \
materials, lights, displacement, and pattern generation. \
 \
This package contains some OSL example shaders."
LICENSE = "BSD-3-Clause"

PV = "1.15.4.0"

RPM_NAME = "OpenShadingLanguage-example-shaders-source-1.15.4.0-3.1.noarch.rpm"
RPM_HASH = "3b3dfe65bfe78ec54bade98c62b8e6b8dc1423671071277cb30a8aec05df729d9863d623a27fa1638e240d42e40a52f227359c8f931cc62bc30433156bbffd9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "OpenShadingLanguage-example-shaders-source"

RDEPENDS:${PN} += "OpenShadingLanguage \
OpenShadingLanguage-common-headers"

inherit rpm
