SUMMARY = "The public gpg key for rpm package signature verification"
DESCRIPTION = "GPG key used in staging projects"
LICENSE = "MIT"

PV = "12.0"

RPM_NAME = "staging-build-key-12.0-1.26.noarch.rpm"
RPM_HASH = "3146bd6f7bde096140ad403eea1037bfd790d7e3b1b7967940631858493c6ffd67fe3e8c0a2cbf2781f627a15eb77b99b8ce4afb6b6b95469caf24e593547674"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "build-key \
staging-build-key"

RDEPENDS:${PN} += ""

inherit rpm
