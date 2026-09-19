SUMMARY = "Fast, scalable, distributed revision control system"
DESCRIPTION = "Git is a fast, scalable, distributed revision control system with an \
unusually rich command set that provides both high-level operations and \
full access to internals. \
 \
This package itself only provides the README of git but with the \
packages it requires, it brings you a complete Git environment \
including GTK and email interfaces and tools for importing source code \
repositories from other revision control systems such as subversion, \
CVS, and GNU arch."
LICENSE = "GPL-2.0-only"

PV = "2.55.0"

RPM_NAME = "git-2.55.0-3.2.aarch64.rpm"
RPM_HASH = "928851d413c848b463c080e7245df80ca35227cc7496b75c6fb1fbddc373e946a79ba01a49f4d336a4cec303d372f861f4e5299d6957750c00c66a9270df8bd8"

RPROVIDES:${PN} += "git"

RDEPENDS:${PN} += "git-core \
perl-Git"

inherit rpm
