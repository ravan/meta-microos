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

PV = "0.25.0"

RPM_NAME = "docker-stable-buildx-0.25.0-19.3.aarch64.rpm"
RPM_HASH = "6b25bc61e6b373fc0363c2a9fffb722e7c9ed7137543cff806890fa7499656ff35881171ed003fe19e339397374c87af006ff13faae35e96610344d6b28c2748"

RPROVIDES:${PN} += "docker-buildx \
docker-stable-buildx"

RDEPENDS:${PN} += "docker-stable \
libc.so.6"

inherit rpm
