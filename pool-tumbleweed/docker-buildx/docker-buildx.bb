SUMMARY = "Docker CLI plugin for extended build capabilities with BuildKit"
DESCRIPTION = "buildx is a Docker CLI plugin for extended build capabilities with BuildKit. \
 \
Key features: \
- Familiar UI from docker build \
- Full BuildKit capabilities with container driver \
- Multiple builder instance support \
- Multi-node builds for cross-platform images \
- Compose build support \
- High-level build constructs (bake) \
- In-container driver support (both Docker and Kubernetes)"
LICENSE = "Apache-2.0"

PV = "0.36.1"

RPM_NAME = "docker-buildx-0.36.1-41.1.aarch64.rpm"
RPM_HASH = "9e984ce8c2934d8865cebd9f2f6b3b05cb83a89cef51993203b246e1d5709f88c04b27b3a8c5847fa0b15147e34258df190a06f16b10d80e8a0205d591009036"

RPROVIDES:${PN} += "docker-buildx"

RDEPENDS:${PN} += "docker \
libc.so.6"

inherit rpm
