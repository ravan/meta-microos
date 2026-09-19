SUMMARY = "Fish Completion for linkerd-cli-edge"
DESCRIPTION = "Fish command line completion support for linkerd-cli-edge."
LICENSE = "Apache-2.0"

PV = "26.8.4"

RPM_NAME = "linkerd-cli-edge-fish-completion-26.8.4-1.1.noarch.rpm"
RPM_HASH = "988c54c2827d4160ef899395237da48dd7b5b715f256c60104f6eceed7add90020e26e2e5408c83d0254fbca74e330b410392bdcd4efbd70183d0f53445aa062"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "linkerd-cli-edge-fish-completion"

RDEPENDS:${PN} += "linkerd-cli-edge"

inherit rpm
