SUMMARY = "LuaDoc-compatible documentation generation system"
DESCRIPTION = "LDoc is a LuaDoc-compatible documentation generator which can \
also process C extension source. Markdown may be optionally used \
to render comments, as well as integrated readme documentation \
and pretty-printed example files."
LICENSE = "MIT"

PV = "1.4.6"

RPM_NAME = "lua53-ldoc-1.4.6-9.3.noarch.rpm"
RPM_HASH = "4be2f56ed21d14233f89a4389fbe4742491887a0e4d984d12570a8f66b7c023c6a26cad86993e8c7de1c39149075e09523d00f49a0af69713fbbf73c0e5e6d71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-ldoc"

RDEPENDS:${PN} += "lua53"

inherit rpm
