SUMMARY = "Environment switcher for shells"
DESCRIPTION = "direnv knows how to hook into bash, zsh, tcsh and fish shell to load \
or unload environment variables depending on the current directory. \
This allows to have project-specific environment variables and not \
clutter the '~/.profile' file."
LICENSE = "MIT"

PV = "2.37.1"

RPM_NAME = "direnv-2.37.1-1.8.aarch64.rpm"
RPM_HASH = "7b24263f769126e66fa508ba14d2154012e037cad770b700675e2daeb5fb5cc048f20fffe6340dfe5faeb440d8b612fafb1cc7adaf3260ec09791a7af5f3f5a1"

RPROVIDES:${PN} += "direnv"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
