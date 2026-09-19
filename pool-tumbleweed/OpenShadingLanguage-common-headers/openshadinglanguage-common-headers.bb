SUMMARY = "OSL standard library and auxiliary headers"
DESCRIPTION = "Open Shading Language (OSL) is a language for programmable shading \
in advanced renderers and other applications, ideal for describing \
materials, lights, displacement, and pattern generation. \
 \
This package contains the OSL standard library headers, as well \
as some additional headers useful for writing shaders."
LICENSE = "BSD-3-Clause"

PV = "1.15.4.0"

RPM_NAME = "OpenShadingLanguage-common-headers-1.15.4.0-3.1.noarch.rpm"
RPM_HASH = "8e3d22b2ce9b0fc333fab267bb16db6f276ab0c541b1873e0ae60e498f5f3bd4a032c1da98446c522fac2b1bdb21e2bad527190929e1790fedee27c0095a90c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "OpenShadingLanguage-common-headers"

RDEPENDS:${PN} += "OpenShadingLanguage"

inherit rpm
