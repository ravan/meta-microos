SUMMARY = "Fish completion for watson"
DESCRIPTION = "Fish command line completion support for watson."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "watson-fish-completion-2.1.0-1.15.noarch.rpm"
RPM_HASH = "1c1f43077086a5fd2596c72165ccd82b2a9d36d96d0a20a3485dba6bf908463f5260686457775d2ee3b35ad4aac1cc270da49d0d155b20ddc5406c05450e334b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "watson-fish-completion"

RDEPENDS:${PN} += "watson"

inherit rpm
