SUMMARY = "Fish completion for sequoia-sqv"
DESCRIPTION = "Fish command line completion support for sequoia-sqv."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.0"

RPM_NAME = "sequoia-sqv-fish-completion-1.3.0-2.3.noarch.rpm"
RPM_HASH = "ee7ab1165c5808bcf8cfa5901908b99dfaf40a45b8628784fa16d62f9504a7f55ca695bbd7ff422ede001002cd7361b15256cfc3db70216b07d38b0fe5f84c63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sequoia-sqv-fish-completion"

RDEPENDS:${PN} += "sequoia-sqv"

inherit rpm
