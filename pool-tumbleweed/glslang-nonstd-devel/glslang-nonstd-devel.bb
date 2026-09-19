SUMMARY = "Secondary set of header files for glslang"
DESCRIPTION = "glslang is a compiler front end for the OpenGL ES and OpenGL shading \
languages. It implements a strict interpretation of the \
specifications for these languages. \
 \
This package contains additional headers that are not officially installed, \
but which some downstream packages rely on."
LICENSE = "BSD-3-Clause"

PV = "16.5.0"

RPM_NAME = "glslang-nonstd-devel-16.5.0-1.1.noarch.rpm"
RPM_HASH = "d03a90d8da81a400a5f4ded57eb4252e0c328d4e21dc4bb8bc00a811c8e81ce01cadab3d377b4fea18b06b2bcc62a777418f07e3e3520cf0d2e881ccbc6d7170"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glslang-nonstd-devel"

RDEPENDS:${PN} += "libglslang16"

inherit rpm
