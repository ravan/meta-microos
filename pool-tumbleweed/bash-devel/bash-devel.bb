SUMMARY = "Include Files mandatory for Development of bash loadable builtins"
DESCRIPTION = "This package contains the C header files for writing loadable new \
builtins for the interpreter Bash. Use the output of the command \
`pkg-config bash --cflags' on the compilers command line."
LICENSE = "GPL-3.0-or-later"

PV = "5.3.15"

RPM_NAME = "bash-devel-5.3.15-8.2.aarch64.rpm"
RPM_HASH = "610e0d78b66da3913eeb954019030ed407756a4db4db6b5eb28e8653be0deb8b67dc53fa5bdd5e316c1beff2411bb76dda1b8c534a93afc758ffd90ba83076cb"

RPROVIDES:${PN} += "bash-devel \
pkgconfig-bash"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
