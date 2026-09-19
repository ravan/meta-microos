SUMMARY = "Lua-based Environment Modules used in HPC"
DESCRIPTION = "Lmod is an Environment Module System as used in High Performance Computing \
(HPC) based on Lua, Reads TCL Modules, Supports a Software Hierarchy. \
Environment Modules are to select the individual versions of HPC libraries \
and tools from a set of installed ones. \
It requires these libraries and tools to be available in separate independent \
directory structures. On SUSE systems default location for these structures \
is under /usr/lib/hpc. \
 \
It is not recommended to install this tool on systems which do not belong \
to an HPC deployment which uses the module system."
LICENSE = "MIT"

PV = "8.7.55"

RPM_NAME = "lua-lmod-8.7.55-4.5.aarch64.rpm"
RPM_HASH = "68e65f5de22732e93cb641dfc3ce5b18327e5b06efd0e87c97f98603803154a9157b971c1e4cb443cc14913e7ba343cf4339f92eadd94757afe0c5bde9c6b7da"

RPROVIDES:${PN} += "config-lua-lmod \
environment-modules \
lua-lmod \
lua-lmod-man \
ml \
rpm-macro-lua-lmod-admin-modulesdir \
rpm-macro-lua-lmod-moduledeps \
rpm-macro-lua-lmod-modulesdir"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/lua \
/usr/bin/sh \
/usr/bin/tclsh \
lua54-luafilesystem \
lua54-luaposix \
lua54-luaterm \
tcl"

inherit rpm
