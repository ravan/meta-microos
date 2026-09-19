SUMMARY = "Build OCI images from APK packages directly without Dockerfile"
DESCRIPTION = "Build and publish OCI container images built from apk packages. \
 \
apko has the following key features: \
 \
- Fully reproducible by default. Run apko twice and you will get exactly the \
  same binary. \
- Fast. apko aims to build images in ms. \
- Small. apko generated images only contain what's needed by the application, \
  in the style of distroless. \
- SBOM Support. apko produces a Software Bill of Materials (SBOM) for images, \
  detailing all the packages inside. \
- Services. apko supports using the s6 supervision suite to run multiple \
  processes in a container without reaping or signalling issues. \
 \
Please note that apko is a work in progress and details are subject to change!"
LICENSE = "Apache-2.0"

PV = "1.2.41"

RPM_NAME = "apko-1.2.41-1.1.aarch64.rpm"
RPM_HASH = "80c001fee2a69bd6cc48f2aa8e8eafd76a967c0c6dbf0f3e5c429afb23d7cbad3eae9ea380ce134c9281f3ec5e2ac3647b586945f413eccdd4f2076b8a69e454"

RPROVIDES:${PN} += "apko"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
