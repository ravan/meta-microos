SUMMARY = "LuaDoc-compatible documentation generation system"
DESCRIPTION = "LDoc is a LuaDoc-compatible documentation generator which can \
also process C extension source. Markdown may be optionally used \
to render comments, as well as integrated readme documentation \
and pretty-printed example files."
LICENSE = "MIT"

PV = "1.4.6"

RPM_NAME = "lua55-ldoc-1.4.6-9.3.noarch.rpm"
RPM_HASH = "b68e727815e0056754c0e0f46767b8230893de810d7da69f78c4f39b0e6abe57c02e3f5465e51ed7a9a4f729452b1b2a7877852a3d796019927e1cfe7ac8940a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua55-ldoc"

RDEPENDS:${PN} += "lua55"

inherit rpm
