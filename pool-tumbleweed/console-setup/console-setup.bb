SUMMARY = "Tools for configuring the console using X Window System key maps"
DESCRIPTION = "This package provides the console with the same keyboard \
configuration scheme that X Window System has. \
Besides the keyboard, the package also configures the font on the \
console.  It includes a rich collection of fonts and supports \
several languages that would be otherwise unsupported on the \
console (such as Armenian, Georgian, Lao and Thai)."
LICENSE = "GPL-2.0-or-later & MIT & SUSE-Public-Domain"

PV = "1.237"

RPM_NAME = "console-setup-1.237-2.4.noarch.rpm"
RPM_HASH = "866bc0ba6721ffd1f7948ffd5e731a61a94370ac57ddb3d375da62ac5f3578175303adde89095ca63615a25cac09644f9354dbb716bdfe4f7c94fd0c929d4ac8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-console-setup \
console-setup"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh"

inherit rpm
