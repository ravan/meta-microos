SUMMARY = "Fish Completion for magic-wormhole.rs"
DESCRIPTION = "Fish command-line completion support for magic-wormhole.rs."
LICENSE = "EUPL-1.2"

PV = "0.8.1"

RPM_NAME = "magic-wormhole.rs-fish-completion-0.8.1-1.3.noarch.rpm"
RPM_HASH = "c46dbfa0ff9abdb3a84eb306f6b3585d346dcf4fa5821e5fca4684f3e17b13f8052aaeeddc14464129a9b6da0e34f9bc71fc9e4ab921498e4687fd05fe4ae7e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "magic-wormhole.rs-fish-completion"

RDEPENDS:${PN} += "fish \
magic-wormhole.rs"

inherit rpm
