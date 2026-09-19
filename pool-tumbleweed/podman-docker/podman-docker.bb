SUMMARY = "Emulate Docker CLI using podman"
DESCRIPTION = "This package installs a script named docker that emulates the Docker CLI by \
executes podman commands, it also creates links between all Docker CLI man \
pages and podman."
LICENSE = "Apache-2.0"

PV = "6.0.2"

RPM_NAME = "podman-docker-6.0.2-1.1.noarch.rpm"
RPM_HASH = "a7a3c9486ccb2ea8e5b87f66dd5de500f00315a2955f3445152888f8880ae4106cc5b091c4cd242a49549cffa894fbb5242941197f36b81b4772aa68abad75c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docker \
podman-docker"

RDEPENDS:${PN} += "/usr/bin/sh \
podman"

inherit rpm
