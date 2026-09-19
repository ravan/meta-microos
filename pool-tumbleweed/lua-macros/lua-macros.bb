SUMMARY = "Macros for lua language"
DESCRIPTION = "RPM macros for lua packaging"
LICENSE = "MIT"

PV = "20210827"

RPM_NAME = "lua-macros-20210827-10.2.noarch.rpm"
RPM_HASH = "f1ef896569558687d5773c46ea7cc677849e9227d3aa80637eae2fdeab20e8777ce8f6ba90b884e357d537b21d49e0ced93a21a010f8e359075a66c103f8a453"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-macros \
rpm-macro-alternatives-requires-exclude \
rpm-macro-lua-archdir \
rpm-macro-lua-exec \
rpm-macro-lua-incdir \
rpm-macro-lua-noarchdir \
rpm-macro-lua-provides \
rpm-macro-lua-value \
rpm-macro-lua-version \
rpm-macro-lua-version-default \
rpm-macro-lua-version-default-nodots \
rpm-macro-lua-version-nodots \
rpm-macro-luarocks-build \
rpm-macro-luarocks-install \
rpm-macro-luarocks-treedir"

RDEPENDS:${PN} += "/usr/bin/bash \
lua-interpreter \
pkgconfig"

inherit rpm
