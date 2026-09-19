SUMMARY = "Fish Completion for linkerd-cli"
DESCRIPTION = "Fish command line completion support for linkerd-cli."
LICENSE = "Apache-2.0"

PV = "2.20"

RPM_NAME = "linkerd-cli-fish-completion-2.20-1.3.noarch.rpm"
RPM_HASH = "faf38c2b9d758b6ce54ea3c386ebb223cbe77c4644d16324f2dcf0b112c1c01236f923a1f5d85355d47bba93138271442a216578b4b92f083d6f8135a71da8a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "linkerd-cli-fish-completion"

RDEPENDS:${PN} += "linkerd-cli"

inherit rpm
