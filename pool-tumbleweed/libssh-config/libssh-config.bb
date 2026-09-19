SUMMARY = "SSH library configuration files"
DESCRIPTION = "Configuration files for the SSH library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.11.5"

RPM_NAME = "libssh-config-0.11.5-2.1.noarch.rpm"
RPM_HASH = "a44c858fa4c824972908df2aad77ae0c0d4bfd88653a8d3c6eff481997b49e4e0da3d7e582ae63b59b2d4e480397c59e1959f23c84ebaee32ab810a9d673d939"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libssh-config"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
