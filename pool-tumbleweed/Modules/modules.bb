SUMMARY = "Change environment at runtime"
DESCRIPTION = "The Modules package is a tool that simplify shell initialization and lets \
users easily modify their environment during the session with modulefiles. \
 \
Each modulefile contains the information needed to configure the shell for an \
application. Once the Modules package is initialized, the environment can be \
modified on a per-module basis using the module command which interprets \
modulefiles. Typically modulefiles instruct the module command to alter or set \
shell environment variables such as PATH, MANPATH, etc. modulefiles may be \
shared by many users on a system and users may have their own collection to \
supplement or replace the shared modulefiles. \
 \
Modules can be loaded and unloaded dynamically and atomically, in an clean \
fashion. All popular shells are supported, including bash, ksh, zsh, sh, csh, \
tcsh, fish, as well as some scripting languages such as tcl, perl, python, \
ruby, cmake and r. \
 \
Modules are useful in managing different versions of applications. Modules can \
also be bundled into metamodules that will load an entire suite of different \
applications."
LICENSE = "GPL-2.0-or-later"

PV = "4.8.0"

RPM_NAME = "Modules-4.8.0-4.7.aarch64.rpm"
RPM_HASH = "2317c89aad2db1b8e347ce23239323af761934f2ce3849038382c51521a5dea5692320effe1dd4a3c2efbc6fb08c43459ca7180665d0301ddcc3d6b6e22889a5"

RPROVIDES:${PN} += "Modules \
config-Modules \
environment-modules \
libtclenvmodules.so"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
/usr/bin/tclsh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
python3 \
tcl"

inherit rpm
