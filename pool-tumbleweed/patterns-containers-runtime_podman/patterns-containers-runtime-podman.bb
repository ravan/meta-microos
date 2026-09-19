SUMMARY = "Podman Container Runtime for non-clustered systems"
DESCRIPTION = "This pattern installs Podman as the container runtime for non-clustered systems."
LICENSE = "MIT"

PV = "5.1"

RPM_NAME = "patterns-containers-runtime_podman-5.1-10.2.aarch64.rpm"
RPM_HASH = "474b7fe302e1b7e0fe5439a3170ca28ef7185752c0fb9461ac531334daebdb5d90af1288ac68af1ef4c73ac5925f814b59f17b257a29ed5349d473cb9f25eb9b"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-container-runtime-podman \
patterns-containers-container-runtime \
patterns-containers-runtime-podman \
patterns-microos-container-runtime"

RDEPENDS:${PN} += "pattern- \
podman"

inherit rpm
