SUMMARY = "LuaDoc-compatible documentation generation system"
DESCRIPTION = "LDoc is a LuaDoc-compatible documentation generator which can \
also process C extension source. Markdown may be optionally used \
to render comments, as well as integrated readme documentation \
and pretty-printed example files."
LICENSE = "MIT"

PV = "1.4.6"

RPM_NAME = "luajit-ldoc-1.4.6-9.3.noarch.rpm"
RPM_HASH = "19bd09cba9b80c0774d022a495497cb92547ca8db06839f1ba502d595a0f90490ff055d9e10258cb082a7251b5a3f69f28c9adb7bbbd8162edf8f60864bdc93d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "luajit-ldoc"

RDEPENDS:${PN} += "luajit"

inherit rpm
