SUMMARY = "Lightweight Java Game Library 3"
DESCRIPTION = "LWJGL is a Java library that enables cross-platform access to popular native APIs \
useful in the development of graphics (OpenGL, Vulkan), audio (OpenAL), parallel \
computing (OpenCL, CUDA) and XR (OpenVR, LibOVR) applications."
LICENSE = "BSD-3-Clause"

PV = "3.2.3"

RPM_NAME = "lwjgl3-3.2.3-1.24.noarch.rpm"
RPM_HASH = "2771d4f251a62679612517ee51ceaa94cad1c8f4ff817993365e0d7ec8788f61acb2c4524b8b4da059c9599049e9d042fc0935c956ed6ef40a2f095af79790b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lwjgl3 \
mvn-org.lwjgl-lwjgl \
mvn-org.lwjgl-lwjgl-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
