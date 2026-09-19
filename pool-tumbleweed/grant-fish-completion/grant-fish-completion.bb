SUMMARY = "Fish Completion for grant"
DESCRIPTION = "Fish command line completion support for grant."
LICENSE = "Apache-2.0"

PV = "0.6.8"

RPM_NAME = "grant-fish-completion-0.6.8-1.2.noarch.rpm"
RPM_HASH = "5938a723abafe800b81d15ff144b7e193d0f21707fc4b720283ff6e3c81ec5cfc2833452053a85145aee964b35f2a4bdf0eef00810db654f04dc6a61b42ba63c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grant-fish-completion"

RDEPENDS:${PN} += "grant"

inherit rpm
